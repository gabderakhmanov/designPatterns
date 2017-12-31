package com.max.builder;

public class StudentInfoBuilder {

    public String firstName;
    public String lastName;

    public StudentInfoBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public StudentInfoBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public StudentInfo build(){
        return new StudentInfo(this);
    }
}
