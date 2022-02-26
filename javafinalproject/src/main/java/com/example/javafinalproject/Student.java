package com.example.javafinalproject;
public class Student {
    
    private long automaticID;
    private long counter;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        counter = counter + 1;
        this.automaticID = counter;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getAutomaticID(){

        return this.automaticID;
    }

    public String getFirstName(){

        return this.firstName;
    }

    public String getLastName(){

        return this.lastName;
    }

    public void setFirstName(String name){

        this.firstName = name;
    }

    public void setLastName(String name){
        
        this.lastName = name;
    }
}

