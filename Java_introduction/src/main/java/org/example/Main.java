
package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(0));
        System.out.println(isPrime(8));
        System.out.println(isPrime(7));
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
}