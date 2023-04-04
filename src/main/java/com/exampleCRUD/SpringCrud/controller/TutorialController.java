package com.exampleCRUD.SpringCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.exampleCRUD.SpringCrud.service.TutorialService;
import com.exampleCRUD.SpringCrud.model.Tutorial;

import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TutorialController {

    @Autowired
    private TutorialService tutorialService;

    @PostMapping("/tutorials")
    public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
        return tutorialService.saveTutorial(tutorial);
    }

    @GetMapping("/tutorials")
    public Iterable<Tutorial> getTutorials(@RequestParam(required = false) String title) {
            if (title == null)
               return tutorialService.getTutorials();
            else
               return tutorialService.getTutorialsByTitle(title);
    }

    @GetMapping("/tutorials/{id}")
    public Tutorial getTutorial(@PathVariable("id") final Long id) {
        Optional<Tutorial> tutorial = tutorialService.getTutorialById(id);
        return tutorial.orElse(null);
    }

    @PutMapping("/tutorials/{id}")
    public Tutorial updateTutorial(@PathVariable("id") final Long id, @RequestBody Tutorial tutorial) {
       return tutorialService.saveTutorial(tutorial);
    }

    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") final Long id) {
        try {
            tutorialService.deleteTutorial(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/tutorials")
    public ResponseEntity<HttpStatus> deleteAllTutorials() {
        try {
            tutorialService.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
