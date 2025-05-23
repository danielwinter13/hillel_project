package org.example;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Maps {
    public static void main(String[] args){
        String[] arraytask1_1 = {"a", "bb", "a", "bb"};
        System.out.println(getLengthOfStrings(arraytask1_1));
        String[] arraytask1_2 = {"this", "and", "that", "and"};
        System.out.println(getLengthOfStrings(arraytask1_2));
        String[] arraytask1_3 = {"code", "code", "code", "bug"};
        System.out.println(getLengthOfStrings(arraytask1_3));
        String[] arraytask2_1 = {"code", "bug"};
        System.out.println(createMap(arraytask2_1));
        String[] arraytask2_2 = {"man", "moon", "main"};
        System.out.println(createMap(arraytask2_2));
        String[] arraytask2_3 = {"man", "moon", "good", "night"};
        System.out.println(createMap(arraytask2_3));
        String[] arraytask3_1 = {"a", "b", "a", "c", "b"};
        System.out.println(countWords(arraytask3_1));
        String[] arraytask3_2 = {"c", "b", "a"};
        System.out.println(countWords(arraytask3_2));
        String[] arraytask3_3 = {"c", "c", "c", "c"};
        System.out.println(countWords(arraytask3_3));
        System.out.println(mergeStringsByFirstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(mergeStringsByFirstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(mergeStringsByFirstChar(new String[]{}));
        System.out.println(buildResultString(new String[]{"a", "b", "a"}));
        System.out.println(buildResultString(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(buildResultString(new String[]{"a", "", "a"}));
        int[] arraytask4_1 = {3, 1, 2, 2, 1, 2, 3, 3, 3};
        System.out.println(findNumber(arraytask4_1));
        int[] arraytask5_1 = {1, 2, 3, 4};
        int[] arraytask5_2 = {3, 5, 6};
        System.out.println(CrossArrays(arraytask5_1, arraytask5_2));
        int[] arraytask6_1 = {1, 2, 3, 4};
        int[] arraytask6_2 = {3, 5, 6};
        System.out.println(AddingArrays(arraytask6_1, arraytask6_2));


    }
    public static Map<String, Integer> getLengthOfStrings(String[] array){
        Map<String, Integer> stringMap = new HashMap<>();
        for (int i=0; i < array.length; i++){
            stringMap.put(array[i],array[i].length());
        }
        return stringMap;
    }
    public static Map<String, String> createMap(String[] array){
        Map<String, String> stringMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            stringMap.put(String.valueOf(array[i].charAt(0)), String.valueOf(array[i].charAt(array[i].length() - 1)));
        }
        return stringMap;
    }
    public static Map<String, Integer> countWords(String[] array){
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String word : array) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }
    public static Map<String, String> mergeStringsByFirstChar(String[] strings){
        Map<String, String> result = new HashMap<>();
        for (String str : strings) {
            if (str.isEmpty()) {
                continue;
            }
            String firstChar = String.valueOf(str.charAt(0));
            result.put(firstChar, result.getOrDefault(firstChar, "") + str);
        }

        return result;
    }
    public static String buildResultString(String[] strings){
        String doubledChar = "";
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String word : strings) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        for (String i : frequencyMap.keySet()) {
            if (frequencyMap.get(i) % 2 == 0){
                doubledChar = i;
                break;
            }
        }return doubledChar;
    }
    public static int findNumber(int[] numbers){
        int result = 0;
        HashMap<Integer, Integer> numbersList = new HashMap<>();
        for (int i:numbers){
            numbersList.put(i , numbersList.getOrDefault(i,0) + 1);
        }
        int mostFrequent = numbers[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : numbersList.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequent;
    }
    public static boolean CrossArrays(int[] numbersA, int[] numbersB){
        LinkedHashSet<Integer> A = new LinkedHashSet<>();
        LinkedHashSet<Integer> B = new LinkedHashSet<>();
        for (int numA: numbersA){
            A.add(numA);
        }
        for (int numB: numbersB){
            B.add(numB);
        }
        A.retainAll(B);
        if(A.isEmpty()) return false;
        else return true;
    }
    public static TreeSet<Integer> AddingArrays(int[] numA, int[] numB){
        TreeSet<Integer> setA = new TreeSet<>();
        TreeSet<Integer> setB = new TreeSet<>();
        for (int numberA: numA){
            setA.add(numberA);
        }
        for (int numberB: numB){
            setB.add(numberB);
        }
        System.out.println(setA);
        System.out.println(setB);
        setA.addAll(setB);
        return setA;
    }
}
