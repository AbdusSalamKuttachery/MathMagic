package com.salam.ec.mathengine.rest.dto;

public class QuestionTemplateDto
{
   private Long id;
   private Long queryAttributeCnt;
   private String queryStructure;

   public Long getId()
   {
      return id;
   }

   public void setId(Long id)
   {
      this.id = id;
   }

   public Long getQueryAttributeCnt()
   {
      return queryAttributeCnt;
   }

   public void setQueryAttributeCnt(Long queryAttributeCnt)
   {
      this.queryAttributeCnt = queryAttributeCnt;
   }

   public String getQueryStructure()
   {
      return queryStructure;
   }

   public void setQueryStructure(String queryStructure)
   {
      this.queryStructure = queryStructure;
   }

}
