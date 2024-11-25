
package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(0));
        System.out.println(isPrime(8));
        System.out.println(isPrime(7));
        System.out.println(checkAge(18));
        System.out.println(checkAge(0));
        System.out.println(checkAge(99));
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(20));
        System.out.println(isPerfectSquare(9));
        System.out.println(calculateSumUpToN(1));
        System.out.println(calculateSumUpToN(3));
        System.out.println(calculateSumUpToN(0));
        System.out.println(getGrade(5));
        System.out.println(getGrade(1));
        System.out.println(getGrade(-3));
    }

    public static boolean isPrime(int A) {
        int check = 0;
        if (A <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(A); i++){
            if(A % i == 0){
                return false;
            }
        }
        return true;
    }
    public static String checkAge(int a) {
        if ( a >= 18){
            return "Ви є дорослою людиною";
        }else {
            return "Ви не є дорослою людиною";
        }
    }
    public static boolean isPerfectSquare(int a) {
        if(Math.sqrt(a) % 1 == 0){
            return true;
        }else {
            return false;
        }
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
    public static String getGrade(int A) {
        switch (A) {
            case 1:
                return "Погано";
            case 2:
                return "Не дуже добре";
            case 3:
                return "Посередньо";
            case 4:
                return "Не погано";
            case 5:
                return "Відмінно";
            default:
                return "Неправильна оцінка";
        }
    }
}