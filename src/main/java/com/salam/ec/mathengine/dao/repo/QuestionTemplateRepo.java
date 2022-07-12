package com.salam.ec.mathengine.dao.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.salam.ec.mathengine.dao.domain.QuestionTemplate;

@Repository
@RepositoryRestResource(exported = false)
public interface QuestionTemplateRepo extends CrudRepository<QuestionTemplate, Long>
{

}
