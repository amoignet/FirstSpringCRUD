package com.exampleCRUD.SpringCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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
    public Iterable<Tutorial> getTutorials() {
        return tutorialService.getTutorials();
    }

    @GetMapping("/tutorials/{id}")
    public Tutorial getTutorial(@PathVariable("id") final Long id) {
        Optional<Tutorial> tutorial = tutorialService.getTutorialById(id);
        if (tutorial.isPresent()) {
            return tutorial.get();
        } else {
            return null;
        }
    }

    @GetMapping("/tutorials/title")
    public Iterable<Tutorial> findTutorialsByTitle(@RequestParam("title") String title)  {
        return tutorialService.getTutorialsByTitle(title);
    }

    @PutMapping("/tutorials/{id}")
    public Tutorial updateTutorial(@PathVariable("id") final Long id, @RequestBody Tutorial tutorial) {
       return tutorialService.saveTutorial(tutorial);
    }

    @DeleteMapping("/tutorials/{id}")
    public void deleteTutorial(@PathVariable("id") final Long id) {
        tutorialService.deleteTutorial(id);
    }

    @DeleteMapping("/tutorials")
    public void deleteAllTutorials() {
        tutorialService.deleteAll();
    }


}
