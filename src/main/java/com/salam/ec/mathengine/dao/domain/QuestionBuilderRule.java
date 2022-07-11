package com.salam.ec.mathengine.dao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION_TEMPLATE_RULES", indexes = @Index(columnList = "qrl_parent_id"))
public class QuestionBuilderRule
{
   @Id
   @GeneratedValue
   @Column(name = "qrl_id")
   private Long id;

   @Column(name = "qrl_parent_id")
   private Long parentId;
   @Column(name = "qrl_seq_num")
   private Long ruleSeqNum;

   @Column(name = "qrl_min_method")
   private String minMethod;
   @Column(name = "qrl_max_method")
   private String maxMethod;
   @Column(name = "qrl_min_expression")
   private String minExpression;
   @Column(name = "qrl_max_expression")
   private String maxExpression;
   @Column(name = "qrl_min_value")
   private int minValue;
   @Column(name = "qrl_max_value")
   private int maxValue;
   @Column(name = "qrl_target_attribute")
   private int targetAttributeNumber;

   public String getMinMethod()
   {
      return minMethod;
   }

   public void setMinMethod(final String minMethod)
   {
      this.minMethod = minMethod;
   }

   public String getMaxMethod()
   {
      return maxMethod;
   }

   public void setMaxMethod(final String maxMethod)
   {
      this.maxMethod = maxMethod;
   }

   public String getMinExpression()
   {
      return minExpression;
   }

   public void setMinExpression(final String minExpression)
   {
      this.minExpression = minExpression;
   }

   public String getMaxExpression()
   {
      return maxExpression;
   }

   public void setMaxExpression(final String maxExpression)
   {
      this.maxExpression = maxExpression;
   }

   public int getMinValue()
   {
      return minValue;
   }

   public void setMinValue(final int minValue)
   {
      this.minValue = minValue;
   }

   public int getMaxValue()
   {
      return maxValue;
   }

   public void setMaxValue(final int maxValue)
   {
      this.maxValue = maxValue;
   }

   public int getTargetAttributeNumber()
   {
      return targetAttributeNumber;
   }

   public void setTargetAttributeNumber(final int targetAttributeNumber)
   {
      this.targetAttributeNumber = targetAttributeNumber;
   }

   public Long getId()
   {
      return id;
   }

   public void setId(Long id)
   {
      this.id = id;
   }

   public Long getParentId()
   {
      return parentId;
   }

   public void setParentId(Long parentId)
   {
      this.parentId = parentId;
   }

   public Long getRuleSeqNum()
   {
      return ruleSeqNum;
   }

   public void setRuleSeqNum(Long ruleSeqNum)
   {
      this.ruleSeqNum = ruleSeqNum;
   }

}
