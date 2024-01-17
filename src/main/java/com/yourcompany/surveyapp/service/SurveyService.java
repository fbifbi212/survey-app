package com.yourcompany.surveyapp.service;

import com.yourcompany.surveyapp.model.Survey;

public interface SurveyService {
    Survey createSurvey(Survey survey);
    Survey getSurveyById(Long id);
    // Diğer servis metodları...
}