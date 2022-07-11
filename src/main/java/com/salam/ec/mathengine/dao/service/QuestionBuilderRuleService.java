package com.salam.ec.mathengine.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salam.ec.mathengine.dao.domain.QuestionBuilderRule;
import com.salam.ec.mathengine.dao.repo.QuestionBuilderRuleRepo;

@Service
public class QuestionBuilderRuleService
{
   private QuestionBuilderRuleRepo queryRuleRepo;

   @Autowired
   public QuestionBuilderRuleService(QuestionBuilderRuleRepo queryRuleRepo)
   {
      this.queryRuleRepo = queryRuleRepo;
   }

   public List<QuestionBuilderRule> getRulesForTemplate(Long id)
   {
      return queryRuleRepo.findAllByParentId(id);
   }

}
