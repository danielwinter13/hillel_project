package org.example;

import jdk.jshell.spi.SPIResolutionException;

public class Person {
    private int age;
    private String name;
    private String profession;

    public Person(int age, String name, String profession){
        this.age = age;
        this.name = name;
        this.profession = profession;
    }

    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setProfession(String newProfession){
        profession = newProfession;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String gerProfession(){
        return profession;
    }
}
