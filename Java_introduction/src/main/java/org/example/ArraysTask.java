package org.example;

import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) {
        int[] task1 = {2,7,8,12,543,765,55,7};
        middleValue(task1);
        int[] task2 = {4,5,7,12,43,67,34,67};
        sorting(task2);
        int[] task3 = {1,5,7,8,9,1,2,5,76,67,12};
        reverseArray(task3);
        int[] task4 = {3,5,7,12,6,8,34,876,12};
        checkValue(3, task4);
    }
    public static void middleValue(int [] num) {
        double sum = 0;
        double index = num.length;
        for (int i:num) {
            sum += i;
        }
        System.out.println(sum / index);
    }
    public static void sorting(int[] num2) {
        Arrays.sort(num2);
        int i = num2.length - 1;
        System.out.println(num2[0] + "\n" + num2[i]);
    }
    public static void reverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
    public static void checkValue(int number,int[] array){
        boolean check = false;
        for (int i:array){
            if (i == number){
                System.out.println("\n"+"Число входить в масив");
                check = true;
            }
        }
        if (!check){
            System.out.println("\n"+"Число не входить в масив");
        }
    }
}


