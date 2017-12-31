package com.max.builder;

public class StudentInfo {

    private final String firstName;
    private final String lastName;

    public StudentInfo(StudentInfoBuilder builder){
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
