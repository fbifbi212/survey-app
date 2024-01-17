package com.yourcompany.surveyapp.controller;

import com.yourcompany.surveyapp.model.Survey;
import com.yourcompany.surveyapp.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/surveys")
public class SurveyController {

    private final SurveyService surveyService;

    @Autowired
    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @GetMapping("/{id}")
    public String getSurvey(@PathVariable Long id, Model model) {
        Survey survey = surveyService.getSurveyById(id);
        model.addAttribute("survey", survey);
        return "surveyDetails";
    }

    // Diğer controller metodları...
}
