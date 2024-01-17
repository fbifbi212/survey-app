package com.yourcompany.surveyapp.service;

import com.yourcompany.surveyapp.model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    // Diğer servis metodları...
}
