package com.bezkoder.spring.oracle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bezkoder.spring.oracle.model.Tutorial;

public interface TutorialRepository extends CrudRepository<Tutorial, Long> {
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);
}
