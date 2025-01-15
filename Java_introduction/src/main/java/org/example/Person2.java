package org.example;

import java.util.Arrays;

public class Person2 {
    public static void main(String[] args){
        Men men = new Men(13, "Oleg","STUDENT");
        men.displayInformation(); //реалізував оверлоад методу нащадка від Персон
        men.displayInformation("Men additional info"); //реалізував оверлоад методу нащадка від Персон
        Women women = new Women(22, "Tanya","DOCTOR");
        women.displayInformation(); //реалізував оверлоад методу нащадка від Персон
        women.displayInformation("Women additional info"); //реалізував оверлоад методу нащадка від Персон

        System.out.println(women.getName());//перевизначив методи абстрактного класа Персон для нащадків
        System.out.println(men.getName());//перевизначив методи абстрактного класа Персон для нащадків
    }
}
