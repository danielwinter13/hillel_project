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
//        int[] task2_1 = {1, 2, 3, 4, 100};
//        centeredAverage(task2_1);
//        int[] task2_2 = {1, 1, 5, 5, 10, 8, 7};
//        centeredAverage(task2_2);
//        int[] task2_3 = {-10, -4, -2, -4, -2, 0};
//        centeredAverage(task2_3);
//        int[] task3_1 = {1, 2, 2};
//        sumIgnoreSections(task3_1);
//        int[] task3_2 = {1, 2, 2, 6, 99, 99, 7};
//        sumIgnoreSections(task3_2);
//        int[] task3_3 = {1, 1, 6, 7, 2};
//        sumIgnoreSections(task3_3);
//        int[] task4_1 = {1, 2, 2, 1};
//        sumIgnoreSections(task4_1);
//        int[] task4_2 = {1, 1};
//        sumIgnoreSections(task4_2);
//        int[] task4_3 = {1, 2, 13, 2, 1, 13};
//        sumIgnoreSections(task4_3);
//        int[] task4_4 = {};
//        sumIgnoreSections(task4_4);
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

    //    public static void countEvenInts(int[] array1) {
//        int number = 0;
//        for (int i : array1){
//            if (i % 2 == 0){
//                number++;
//            }
//        }System.out.println(number);
//    }
//    public static void centeredAverage(int[] array2) {
//        Arrays.sort(array2);
//        int sum = 0;
//        if ((array2[0] == array2[1]) && (array2[array2.length - 1] == array2[array2.length - 2])) {
//            for (int i = 2; i < array2.length - 2; i++) {
//                sum += array2[i];
//            }
//            System.out.println(sum/(array2.length - 4));
//        }else if (array2[0] == array2[1]) {
//            for (int i = 2; i < array2.length - 1; i++) {
//                sum += array2[i];
//            }
//            System.out.println(sum/(array2.length - 3));
//        }else if (array2[array2.length - 1] == array2[array2.length - 2]){
//            for (int i = 2; i < array2.length - 1; i++) {
//                sum += array2[i];
//            }
//            System.out.println(sum/(array2.length - 3));
//        }else{
//            for (int i = 1; i < array2.length - 1; i++) {
//                sum += array2[i];
//            }
//            System.out.println(sum/(array2.length - 2));
//    }   }
//    public static void sumIgnoreSections(int[] array3) {
//        int sum = 0;
//        int[] subArray = Arrays.copyOf(array3, array3.length);
//        Arrays.sort(subArray);
//        int IsSixExist = Arrays.binarySearch(subArray, 6);
//        int IsSevenExist = Arrays.binarySearch(subArray, 7);
//        if (IsSixExist < 0) {
//            for (int i = 0; i < array3.length; i++){
//                sum += array3[i];
//            } System.out.println(sum);
//        } else {
//            for (int i = 0; i <= array3.length; i++) {
//                if (array3[i] == 6) {
//                    break;
//                }
//                sum += array3[i];
//            }
//            if (IsSevenExist >= 0) {
//                int indexOfSeven = 0;
//                for (int i = 0; i <= array3.length; i++) {
//                    if (array3[i] == 7) {
//                        break;
//                    }
//                    indexOfSeven = i + 1;
//                }
//                for (int i = indexOfSeven + 1; i < array3.length; i++) {
//                    sum += array3[i];
//                }
//                System.out.println(sum);
//            }else {
//                System.out.println(sum);
//            }
//        }
//    }
//    public static void sumIgnoreSections(int[] array4) {
//        int sum = 0;
//        int[] subArray = Arrays.copyOf(array4,array4.length);
//        Arrays.sort(subArray);
//        int Is13Exist = Arrays.binarySearch(subArray,13);
//        if (array4.length>0 ){
//            if (Is13Exist > 0){
//                for (int i = 0; i < array4.length; i ++){
//                    if (array4[i] == 13){
//                        break;
//                    }sum += array4[i];
//                }
//                System.out.println(sum);
//            }else {
//                for (int i = 0; i < array4.length; i ++){
//                    sum += array4[i];
//                }
//                System.out.println(sum);
//            }
//        }else{
//            System.out.println("Array lenght is " + array4.length);
//        }
//    }
//    public static void differenceLargestSmallest(int[] array5) {
//        Arrays.sort(array5);
//        if (array5.length > 1){
//            System.out.println(array5[array5.length-1] - array5[0]);
//        }else {
//            System.out.println("Array has only : "+ array5[0]);
//        }
//    }
}
