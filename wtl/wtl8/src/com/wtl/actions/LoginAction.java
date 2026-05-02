package com.wtl.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.wtl.models.Student;
import com.wtl.services.StudentService;
import com.wtl.services.StudentServiceImpl;

/**
 * Struts 2 Action for handling Student Login.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private Student student;

    // In a real application, we would use Dependency Injection (e.g. Spring/Guice)
    // For this lab, we manually instantiate the implementation.
    private StudentService studentService = new StudentServiceImpl();

    @Override
    public String execute() {
        this.student = studentService.authenticate(username, password);
        
        if (this.student != null) {
            return SUCCESS;
        } else {
            addActionError("Invalid Student ID or Password. Please try again.");
            return ERROR;
        }
    }

    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}
