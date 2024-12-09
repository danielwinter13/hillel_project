package org.example;

import java.util.Arrays;

public class NewString {
    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
//        int[] centeredNumber = {5, 2, 32, 4, 1, 100};
//        centeredAverage(centeredNumber);
    }

    public static boolean catDog(String string_task1) {
        int catCount = 0;
        int dogCount = 0;
        int index = string_task1.indexOf("cat");
        while (index != -1) {
            catCount++;
            index = string_task1.indexOf("cat", index + 1);
        }
        index = string_task1.indexOf("dog");
        while (index != -1) {
            dogCount++;
            index = string_task1.indexOf("dog", index + 1);
        }
        if (dogCount == catCount) {
            return true;
        } else return false;
    }

//    public static void centeredAverage(int[] number) {
//        Arrays.sort(number);
//        System.out.println(Arrays.toString(number));
//    }
}
