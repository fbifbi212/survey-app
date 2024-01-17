package com.yourcompany.surveyapp.repository;

import com.yourcompany.surveyapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
