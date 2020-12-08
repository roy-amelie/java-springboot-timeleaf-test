package com.fronttest.FrontTest.model;

public class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person() {

    }

    public Person(int id,String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonById (int id){
        return this.id;
    }
}
