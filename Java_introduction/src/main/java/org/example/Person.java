package org.example;

public class Person{
    private int age;
    private String name;
    private PersonRole personRole;


    public Person(int age, String name, String personRole){
        this.age = age;
        this.name = name;
        this.personRole = PersonRole.valueOf(personRole.toUpperCase());
    }

    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setProfession(String newProfession){
        personRole = PersonRole.valueOf(newProfession.toUpperCase());
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getProfession(){
        return personRole.name();
    }



}


