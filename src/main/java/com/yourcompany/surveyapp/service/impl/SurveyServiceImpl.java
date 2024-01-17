package com.yourcompany.surveyapp.service;

import com.yourcompany.surveyapp.model.Survey;
import com.yourcompany.surveyapp.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImpl implements SurveyService {

    private final SurveyRepository surveyRepository;

    @Autowired
    public SurveyServiceImpl(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @Override
    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    @Override
    public Survey getSurveyById(Long id) {
        return surveyRepository.findById(id).orElse(null);
    }

    // Diğer servis metodları...
}
