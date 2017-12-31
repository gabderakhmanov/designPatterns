package com.max.builder;

public class Starter {

    public static void main(String[] args){

        StudentInfoBuilder builder = new StudentInfoBuilder();
        StudentInfo stInfo = builder.firstName("Max").lastName("Gee").build();

        System.out.println(stInfo.getFirstName() + stInfo.getLastName());
    }

}
