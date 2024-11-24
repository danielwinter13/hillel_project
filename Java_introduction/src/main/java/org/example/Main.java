
package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(20));
        System.out.println(isPerfectSquare(9));
    }
    public static boolean isPerfectSquare(int a) {
                if(Math.sqrt(a) % 1 == 0){
                    return true;
                }else {
                    return false;
                }
            }
}
