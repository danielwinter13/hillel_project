package org.example;

public class ArraysTask {
    public static void main(String[] args) {
        MiddleValue();
    }
    public static void MiddleValue() {
        int[] num = {2, 4, 5, 4, 5};
        int sum = 0;
        for (int i:num) {
            sum += i;
        }
        System.out.println(sum);
    }
}
