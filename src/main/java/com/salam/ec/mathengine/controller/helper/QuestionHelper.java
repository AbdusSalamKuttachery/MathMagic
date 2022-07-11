package com.salam.ec.mathengine.controller.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QuestionHelper
{
   @Autowired
   TemplateProcessor template;

   public String getNewQuestionForTemplate(final Long id)
   {

      final TemplateProcessorData templateDataProcessed = template.getTemplateDetails(id);
      final Long numbOfArgs = templateDataProcessed.getNumberOfArguments();
      final int[] templateValueList = templateDataProcessed.getTemplateValueList();
      String queryTemplate = templateDataProcessed.getQueryTemplate();

      for (int i = 1; i < (numbOfArgs + 1); i++)
      {
         queryTemplate = queryTemplate.replaceFirst("%" + i,
            Integer.toString(templateValueList[i - 1]));
      }

      return queryTemplate;

   }


}
