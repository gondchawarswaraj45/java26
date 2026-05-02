package com.wtl.models;

import java.io.Serializable;

/**
 * POJO representing a Student.
 */
public class Student implements Serializable {
    private String username;
    private String fullName;
    private String department;
    private String email;

    public Student() {}

    public Student(String username, String fullName, String department, String email) {
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.email = email;
    }

    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
