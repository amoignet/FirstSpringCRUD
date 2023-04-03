package com.exampleCRUD.SpringCrud;

import com.exampleCRUD.SpringCrud.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exampleCRUD.SpringCrud.model.Tutorial;


@SpringBootApplication
public class SpringCrudApplication implements CommandLineRunner {

	@Autowired
	private TutorialService tutorialService;

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudApplication.class, args);

	}

	public void run(String... args) throws Exception {
//		Iterable<Tutorial> searchResults = tutorialService.getTutorialsByTitle("Second");
//		searchResults.forEach(tutorial -> System.out.println(tutorial.getDescription()));
	}

}
