package com.exampleCRUD.SpringCrud.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.exampleCRUD.SpringCrud.repository.TutorialRepository;
import com.exampleCRUD.SpringCrud.model.Tutorial;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    public Tutorial saveTutorial(Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }

    public Iterable<Tutorial> getTutorials() {
        return tutorialRepository.findAll();
    }

    public Optional<Tutorial> getTutorialById(final Long id) {
        return tutorialRepository.findById(id);
    }

    public Iterable<Tutorial> getTutorialsByTitle(String title) { return tutorialRepository.findByTitleEquals(title);}

    public void deleteTutorial(final Long id) {
        tutorialRepository.deleteById(id);
    }

    public void deleteAll() {
        tutorialRepository.deleteAll();
    }

}
