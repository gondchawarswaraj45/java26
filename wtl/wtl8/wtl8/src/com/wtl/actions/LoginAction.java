package com.wtl.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private String studentName;

    // Standard Struts 2 execute method
    @Override
    public String execute() {
        // Mock validation logic for Student Portal
        if ("student".equals(username) && "password123".equals(password)) {
            this.setStudentName("John Doe"); 
            return SUCCESS;
        } else {
            addActionError("Invalid Student ID or Password. Please try again.");
            return ERROR;
        }
    }

    // Getters and Setters (Required for Struts 2 to populate fields)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
