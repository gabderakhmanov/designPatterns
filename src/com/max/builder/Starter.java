package com.max.builder;

public class Starter {

    public static void main(String[] args){

        StudentInfoBuilder builder = new StudentInfoBuilder();
        builder.setFirstName("Max");
        builder.setLastName("Gee");

        System.out.println(builder.getFirstName() + builder.getLastName());


    }

}
