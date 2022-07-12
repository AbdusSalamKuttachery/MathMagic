package com.salam.ec.mathengine.controller.helper;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salam.ec.mathengine.dao.domain.QuestionBuilderRule;
import com.salam.ec.mathengine.dao.domain.QuestionTemplate;
import com.salam.ec.mathengine.dao.service.QuestionBuilderRuleService;
import com.salam.ec.mathengine.dao.service.QuestionTemplateService;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

@Component
public class TemplateProcessor
{
   @Autowired
   QuestionTemplateService queryTemplateService;
   @Autowired
   QuestionBuilderRuleService queryBuilderRuleService;

   private Random r; // SecureRandom is preferred to Random

   public TemplateProcessorData getTemplateDetails(final Long templateId)
   {
      r = new Random();
      final TemplateProcessorData data = new TemplateProcessorData();
      final QuestionTemplate quesTemplate = queryTemplateService.getQueryTemplate(templateId);
      data.setNumberOfArguments(quesTemplate.getQueryAttributeCnt());
      data.setQueryTemplate(quesTemplate.getQueryStructure());
      data.setTemplateValueList(CreateArguments(templateId));

      return data;
   }

   private int[] CreateArguments(final Long templateId)
   {

      // final Random r = new Random();
      final List<QuestionBuilderRule> rules = queryBuilderRuleService.getRulesForTemplate(templateId);
      final int[] templateValueList = new int[20];
      for (final QuestionBuilderRule ruleNode : rules)
      {
         int minValue = 0;
         int maxValue = 0;
         if (ruleNode.getMinMethod().equals("Value"))
         {
            minValue = ruleNode.getMinValue();
         }

         if (ruleNode.getMaxMethod().equals("Value"))
         {
            maxValue = ruleNode.getMaxValue();
         }

         if (ruleNode.getMinMethod().equals("Index"))
         {
            minValue = templateValueList[ruleNode.getMinValue() - 1];
         }

         if (ruleNode.getMaxMethod().equals("Index"))
         {
            maxValue = templateValueList[ruleNode.getMaxValue() - 1];
         }

         if (ruleNode.getMaxMethod().equals("Expression"))
         {
            final String expression = ruleNode.getMaxExpression();
            int count = 0;
            String newExpression = expression;
            for (int i = 0; i < expression.length(); i++)
            {
               if (expression.charAt(i) == '%')
               {
                  count = count + 1;
                  final int value = templateValueList[Character
                     .getNumericValue(expression.charAt(i + 1)) - 1];
                  System.out.println("%" + expression.charAt(i + 1) + ":" + value);
                  newExpression = newExpression.replaceFirst("%" + expression.charAt(i + 1),
                     Integer.toString(value));
               }
            }
            final Expression exp = new ExpressionBuilder(newExpression).build();
            final double value = exp.evaluate();
            maxValue = (int) value;
         }

         final int result = r.nextInt(maxValue - minValue) + minValue;
         templateValueList[ruleNode.getTargetAttributeNumber() - 1] = result;
      }
      return templateValueList;
   }
}
