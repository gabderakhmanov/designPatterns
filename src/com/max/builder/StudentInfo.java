package com.max.builder;

public class StudentInfo {

    private final String firstName;
    private final String lastName;

    public StudentInfo(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
