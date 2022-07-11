package com.salam.ec.mathengine.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salam.ec.mathengine.dao.domain.QuestionTemplate;
import com.salam.ec.mathengine.dao.repo.QuestionTemplateRepo;

@Service
public class QuestionTemplateService
{
   QuestionTemplateRepo queryTemplateRepo;

   @Autowired
   public QuestionTemplateService(QuestionTemplateRepo queryTemplateRepo)
   {
      this.queryTemplateRepo = queryTemplateRepo;
   }

   public QuestionTemplate getQueryTemplate(Long id)
   {
      return queryTemplateRepo.findById(id)
         .orElseThrow(() -> new RuntimeException("Template Id not found!"));
   }

   public void createTemplate(QuestionTemplate templateInp)
   {
      queryTemplateRepo.save(templateInp);
   }

}
