package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Person2 {
    public static void main(String[] args){
//        Men men = new Men(13, "Oleg","STUDENT");
//        men.displayInformation(); //реалізував оверлоад методу нащадка від Персон
//        men.displayInformation("Men additional info"); //реалізував оверлоад методу нащадка від Персон
//        Women women = new Women(22, "Tanya","DOCTOR");
//        women.displayInformation(); //реалізував оверлоад методу нащадка від Персон
//        women.displayInformation("Women additional info"); //реалізував оверлоад методу нащадка від Персон
//
//        System.out.println(women.getName());//перевизначив методи абстрактного класа Персон для нащадків
//        System.out.println(men.getName());//перевизначив методи абстрактного класа Персон для нащадків
//        String[] arraytask1_1 = {"a", "bb", "a", "bb"};
//        System.out.println(getLengthOfStrings(arraytask1_1));
//        String[] arraytask1_2 = {"this", "and", "that", "and"};
//        System.out.println(getLengthOfStrings(arraytask1_2));
//        String[] arraytask1_3 = {"code", "code", "code", "bug"};
//        System.out.println(getLengthOfStrings(arraytask1_3));
        String[] arraytask2_1 = {"code", "bug"};
        System.out.println(createMap(arraytask2_1));
        String[] arraytask2_2 = {"man", "moon", "main"};
        System.out.println(createMap(arraytask2_2));
        String[] arraytask2_3 = {"man", "moon", "good", "night"};
        System.out.println(createMap(arraytask2_3));
    }
//    public static Map<String, Integer> getLengthOfStrings(String[] array){
//        Map<String, Integer> stringMap = new HashMap<>();
//        for (int i=0; i < array.length; i++){
//            stringMap.put(array[i],array[i].length());
//        }
//        return stringMap;
//    }
    public static Map<String, String> createMap(String[] array){
        Map<String, String> stringMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            stringMap.put(String.valueOf(array[i].charAt(0)), String.valueOf(array[i].charAt(array[i].length() - 1)));
        }
        return stringMap;
    }
}
