package org.example;

import java.util.Arrays;

public class Person2 {
    public static void main(String[] args){
        Men John = new Men(30, "John", "ENGINEER");
        Men Bob = new Men(35, "Bob", "DOCTOR");
        Women Mary = new Women(25, "Mary", "TEACHER");
        John.displayInformation();
        Mary.displayInformation();
        Bob.displayInformation();
        Women Alice = new Women(25, "Alice", "ARTIST");
        Alice.displayInformation();
        Alice.setProfession("STUDENT");
        Alice.displayInformation();
    }
}
