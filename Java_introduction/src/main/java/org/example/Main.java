
package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(calculateSumUpToN(1));
        System.out.println(calculateSumUpToN(3));
        System.out.println(calculateSumUpToN(0));
    }

    public static String calculateSumUpToN(int N) {
        if (N > 0) {
            int sum = 0;
                for (int i = 0; i <= N; i++){
                    sum += i;
            }
                return "" + sum;
        } else {
            return "Хибні вхідні параметри";
        }
    }
}