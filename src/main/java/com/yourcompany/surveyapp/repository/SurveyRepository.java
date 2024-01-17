package com.yourcompany.surveyapp.repository;

import com.yourcompany.surveyapp.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
