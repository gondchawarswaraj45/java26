package com.wtl.services;

import com.wtl.models.Student;

public class StudentServiceImpl implements StudentService {

    @Override
    public Student authenticate(String username, String password) {
        // Business Rule: Hardcoded check for demonstration
        if ("student".equalsIgnoreCase(username) && "password123".equals(password)) {
            return new Student(
                "student", 
                "John Doe", 
                "Computer Science", 
                "john.doe@university.edu"
            );
        }
        return null;
    }
}
