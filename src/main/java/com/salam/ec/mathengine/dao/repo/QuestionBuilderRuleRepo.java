package com.salam.ec.mathengine.dao.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.salam.ec.mathengine.dao.domain.QuestionBuilderRule;

@Repository
@RepositoryRestResource(exported = false)
public interface QuestionBuilderRuleRepo extends CrudRepository<QuestionBuilderRule, Long>
{
   public List<QuestionBuilderRule> findAllByParentId(Long parentId);

}
