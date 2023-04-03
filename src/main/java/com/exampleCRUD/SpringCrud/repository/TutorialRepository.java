package com.exampleCRUD.SpringCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exampleCRUD.SpringCrud.model.Tutorial;


@Repository
public interface TutorialRepository extends CrudRepository<Tutorial, Long> {

     public Iterable<Tutorial> findByTitleEquals(String title);
}
