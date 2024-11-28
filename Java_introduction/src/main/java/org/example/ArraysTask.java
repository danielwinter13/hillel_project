package org.example;

import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) {
        MiddleValue();
        Sorting();
    }
    public static void MiddleValue() {
        int[] num = {2, 4, 5, 4, 5};
        int sum = 0;
        for (int i:num) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void Sorting() {
        int[] num2 = {1,5,7,8,9,1,2,5,76,67,12};
        Arrays.sort(num2);
        int i = num2.length - 1;
        System.out.println(num2[0] + "\n" + num2[i]);

    }
}
