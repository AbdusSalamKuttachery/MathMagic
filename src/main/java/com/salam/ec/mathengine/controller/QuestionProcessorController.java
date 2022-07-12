package com.salam.ec.mathengine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.salam.ec.mathengine.controller.helper.QuestionHelper;
import com.salam.ec.mathengine.controller.helper.QuestionResponse;
import com.salam.ec.mathengine.dao.domain.QuestionTemplate;
import com.salam.ec.mathengine.dao.service.QuestionTemplateService;
import com.salam.ec.mathengine.rest.dto.QuestionTemplateDto;

@RestController
@RequestMapping(path = "/question")
public class QuestionProcessorController
{


   @Autowired
   QuestionHelper quesHelp;

   @Autowired
   QuestionTemplateService templateService;

   @GetMapping(path = "/{id}")
   public @ResponseBody QuestionResponse getNextQuestions(@PathVariable(value = "id") final Long id)
   {
      QuestionResponse newQuery = new QuestionResponse();
      newQuery.setQuestionString(quesHelp.getNewQuestionForTemplate(id));
      return newQuery;
   }

   @PostMapping(path = "/template/save")
   @ResponseStatus(HttpStatus.CREATED)
   public void createQuesTemplate(@RequestBody @Validated QuestionTemplateDto questionInput)
   {
      QuestionTemplate newTemplate = new QuestionTemplate();
      newTemplate.setId(questionInput.getId());
      newTemplate.setQueryAttributeCnt(questionInput.getQueryAttributeCnt());
      newTemplate.setQueryStructure(questionInput.getQueryStructure());
      templateService.createTemplate(newTemplate);
   }
}