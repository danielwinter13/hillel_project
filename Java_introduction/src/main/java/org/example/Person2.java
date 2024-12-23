package org.example;

import java.util.Arrays;

public class Person2 {
    public static void main(String[] args){
        Person personJohn = new Person(30, "John", "Engineer");
        Person personMary = new Person(25, "Mary", "Teacher");
        Person personBob = new Person(35, "Bob", "Doctor");
        System.out.println("Name: " + personJohn.getName() + ", Age" + personJohn.getAge() + ", Profession:" + personJohn.gerProfession());
        System.out.println("Name: " + personMary.getName() + ", Age" + personMary.getAge() + ", Profession:" + personMary.gerProfession());
        System.out.println("Name: " + personBob.getName() + ", Age" + personBob.getAge() + ", Profession:" + personBob.gerProfession());

        Person personAlice = new Person(28, "Alice", "Architect");
        System.out.println("\n" + "Name: " + personAlice.getName() + ", Age" + personAlice.getAge() + ", Profession:" + personAlice.gerProfession());
        System.out.println("(Після оновлення професії)");
        personAlice.setProfession("Designer");
        System.out.println("Name: " + personAlice.getName() + ", Age" + personAlice.getAge() + ", Profession:" + personAlice.gerProfession());
    }
}
