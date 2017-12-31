package com.max.builder;

public class Starter {

    public static void main(String[] args){

        StudentInfoBuilder builder = new StudentInfoBuilder();
        StudentInfo2 stInfo = builder.firstName("Max").lastName("Gee2212").build();

        System.out.println(stInfo.getFirstName() + stInfo.getLastName());
    }

}
