package org.example;

public abstract class Person implements Displayable{
    private static int age;
    public String name;
    private PersonRole personRole;

    public Person(int age, String name, String personRole){
        this.age = age;
        this.name = name;
        this.personRole = PersonRole.valueOf(personRole.toUpperCase());
    }

    public void setAge(int newAge){
        age = newAge;
    };
    public void setName(String newName){
        name = newName;
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


