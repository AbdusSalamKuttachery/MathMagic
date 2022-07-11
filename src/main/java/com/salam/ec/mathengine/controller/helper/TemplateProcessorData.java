package com.salam.ec.mathengine.controller.helper;

public class TemplateProcessorData
{
   public String queryTemplate;
   public Long numberOfArguments;
   public int[] templateValueList;

   public String getQueryTemplate()
   {
      return queryTemplate;
   }

   public void setQueryTemplate(final String queryTemplate)
   {
      this.queryTemplate = queryTemplate;
   }

   public Long getNumberOfArguments()
   {
      return numberOfArguments;
   }

   public void setNumberOfArguments(final Long numberOfArguments)
   {
      this.numberOfArguments = numberOfArguments;
   }

   public int[] getTemplateValueList()
   {
      return templateValueList;
   }

   public void setTemplateValueList(final int[] templateValueList)
   {
      this.templateValueList = templateValueList;
   }

}