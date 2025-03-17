package org.example;

import CustomException.CustomException;

public abstract class Person implements Displayable{
    private static int age;
    public String name;
    private PersonRole personRole;

    public Person(int age, String name, String personRole) throws CustomException {
        if( age < 0){
            throw new IllegalArgumentException("Age should be more than 0");
        }
        this.age = age;
        if (name.isEmpty()){
           throw new CustomException("Name shouldn't be empty");
        }
        this.name = name;
        this.personRole = PersonRole.valueOf(personRole.toUpperCase());
    }

    public void setAge(int newAge){
            if (newAge < 0){
                throw new IllegalArgumentException("Age should be more than 0");
            }
            this.age = newAge;
    };
    public void setName(String newName) throws CustomException{
        if (newName.isEmpty()){
            throw new CustomException("Can't set empty name");
        }
        this.name = newName;
    }
    public void setProfession(String newProfession){
        personRole = PersonRole.valueOf(newProfession.toUpperCase());
    }
    public int getAge(){
        return age;
    }
    public abstract String getName();
    public String getProfession(){
        return personRole.name();
    }
    @Override
    public void displayInformation(){
        System.out.print("Name: " + getName() + ", Age: " + getAge() + ", Profession:" + getProfession());
    }

}


