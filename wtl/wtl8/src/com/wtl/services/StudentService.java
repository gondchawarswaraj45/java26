package com.wtl.services;

import com.wtl.models.Student;

/**
 * Business Interface for Student related operations.
 */
public interface StudentService {
    /**
     * Authenticates a student and returns their profile if successful.
     * @param username Student ID or username.
     * @param password Security password.
     * @return Student object if valid, null otherwise.
     */
    Student authenticate(String username, String password);
}
