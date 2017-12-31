package com.max.builder;

public class Starter {

    public static void main(String[] args){

        StudentInfo studentInfo = new StudentInfoBuilder()
                .firstName("Max")
                .lastName("Gee")
                .build();

        System.out.println(studentInfo.getFirstName() + studentInfo.getLastName());
    }

}
