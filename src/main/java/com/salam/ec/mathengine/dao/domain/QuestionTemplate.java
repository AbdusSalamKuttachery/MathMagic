package com.salam.ec.mathengine.dao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION_TEMPLATE")
public class QuestionTemplate
{
   @Id
   @Column(name = "question_id")
   private Long id;

   @Column(name = "question_attribute_cnt")
   private Long queryAttributeCnt;

   @Column(name = "question_structure", length = 2000)
   private String queryStructure;

   public Long getId()
   {
      return id;
   }

   public void setId(Long id)
   {
      this.id = id;
   }

   public String getQueryStructure()
   {
      return queryStructure;
   }

   public void setQueryStructure(String queryStructure)
   {
      this.queryStructure = queryStructure;
   }

   public Long getQueryAttributeCnt()
   {
      return queryAttributeCnt;
   }

   public void setQueryAttributeCnt(Long queryAttributeCnt)
   {
      this.queryAttributeCnt = queryAttributeCnt;
   }

}
