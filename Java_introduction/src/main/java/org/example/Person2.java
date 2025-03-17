package org.example;

import CustomException.CustomException;

import java.util.Arrays;

public class Person2 {
    public static void main(String[] args) throws CustomException {
        Men men = new Men(13, "Oleg","STUDENT");
        men.displayInformation(); //реалізував оверлоад методу нащадка від Персон
        men.displayInformation("Men additional info"); //реалізував оверлоад методу нащадка від Персон
        Women women = new Women(23, "12312","DOCTOR");
        women.displayInformation(); //реалізував оверлоад методу нащадка від Персон
        women.displayInformation("Women additional info"); //реалізував оверлоад методу нащадка від Персон
        try {
            women.setAge(23);
        }catch (IllegalArgumentException example){
            example.printStackTrace();
        }
        try {
            women.setName("");
        }catch (CustomException example){
            example.printStackTrace();
        }
    }
}
