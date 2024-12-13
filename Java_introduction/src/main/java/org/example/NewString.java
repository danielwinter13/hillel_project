package org.example;
import java.util.Arrays;

public class NewString {
    public static void main(String[] args) {
//        System.out.println(catDog("catdog"));
//        System.out.println(catDog("catcat"));
//        System.out.println(catDog("1cat1cadodog"));
//        int[] task1_1 = {2, 1, 2, 3, 4};
//        countEvenInts(task1_1);
//        int[] task1_2 = {2, 2, 0};
//        countEvenInts(task1_2);
//        int[] task1_3 = {1, 3, 5};
//        countEvenInts(task1_3);
        int[] task2_1 = {1, 2, 3, 4, 100};
        System.out.println(centeredAverage(task2_1));
        int[] task2_2 = {1, 1, 5, 5, 10, 8, 7};
        System.out.println(centeredAverage(task2_2));
        int[] task2_3 = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(task2_3));
        int[] task3_1 = {1, 2, 2};
        System.out.println(sumIgnoreSections(task3_1));
        int[] task3_2 = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sumIgnoreSections(task3_2));
        int[] task3_3 = {1, 1, 6, 7, 2};
        System.out.println(sumIgnoreSections(task3_3));
        int[] task4_1 = {1, 2, 2, 1};
        System.out.println(sumWithoutUnlucky13(task4_1));
        int[] task4_2 = {1, 1};
        System.out.println(sumWithoutUnlucky13(task4_2));
        int[] task4_3 = {1, 2, 2, 1, 13};
        System.out.println(sumWithoutUnlucky13(task4_3));
        int[] task4_4 = {};
        System.out.println(sumWithoutUnlucky13(task4_4));
//        int[] task5_1 = {10, 3, 5, 6};
//        differenceLargestSmallest(task5_1);
//        int[] task5_2 = {7, 2, 10, 9};
//        differenceLargestSmallest(task5_2);
//        int[] task5_3 = {2, 10, 7, 2};
//        differenceLargestSmallest(task5_3);

    }

//    public static boolean catDog(String string_task1) {
//        int catCount = 0;
//        int dogCount = 0;
//        int index = string_task1.indexOf("cat");
//        while (index != -1) {
//            catCount++;
//            index = string_task1.indexOf("cat", index + 1);
//        }
//        index = string_task1.indexOf("dog");
//        while (index != -1) {
//            dogCount++;
//            index = string_task1.indexOf("dog", index + 1);
//        }
//        if (dogCount == catCount) {
//            return true;
//        } else return false;
//    }
//
//        public static void countEvenInts(int[] array1) {
//        int number = 0;
//        for (int i : array1){
//            if (i % 2 == 0){
//                number++;
//            }
//        }System.out.println(number);
//    }
    public static int centeredAverage(int[] array2) {
        Arrays.sort(array2);
        int sum = 0;
        for( int i = 1; i < array2.length - 1; i++){
            sum += array2[i];
        }
        return (sum / (array2.length - 2));
    }
    public static int sumIgnoreSections(int[] array) {
        boolean isCorrect = true;
        int sum = 0;
        for ( int i = 0; i < array.length; i++){
            if (array[i] == 6){
                isCorrect = false;
            }else if (isCorrect){
                sum += array[i];
            }
            else if (array[i] == 7){
                isCorrect = true;
            }
        }return sum;
    }
    public static int sumWithoutUnlucky13(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 13) {
                sum += array[i];
            } else {
                i++;
            }
        }return sum;
    }
//    public static void differenceLargestSmallest(int[] array5) {
//        Arrays.sort(array5);
//        if (array5.length > 1){
//            System.out.println(array5[array5.length-1] - array5[0]);
//        }else {
//            System.out.println("Array has only : "+ array5[0]);
//        }
//    }
}
