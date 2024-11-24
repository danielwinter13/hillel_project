
package org.example;


public class Main {
        public static void main(String[] args) {
            //System.out.println(sleepIn(false, false));
            //System.out.println(sleepIn(true, false));
            //System.out.println(sleepIn(false, true));
            //System.out.println(sumDouble(5,5));
//            System.out.println(makes10(9,10));
//            System.out.println(makes10(9,9));
//            System.out.println(makes10(1,9));
//            System.out.println(posNeg(1, 1, false));
//            System.out.println(posNeg(-1, 1, false));
//            System.out.println(posNeg(-4, -5, true));
            System.out.println(checkAge(18));
            System.out.println(checkAge(0));
            System.out.println(checkAge(99));
        }
//        public static int sumDouble(int a, int b) {
//            if (a == b){
//                return (a + b)*2;
//            }else {
//                return a + b;
//            }
//        }
//        public static boolean makes10(int a, int b) {
//            if ((a == 10 || b == 10) || ((a + b) == 10)){
//                return true;
//            }else {
//                return false;
//            }
//        }
//        public static boolean posNeg(int a, int b, boolean negative) {
//            if ((a < 0 && b < 0) && negative == true){
//                return true;
//            }else if ((a < 0 && b < 0) && negative == false){
//             return false;
//            }else if ((a > 0 && b <0) || (a < 0 && b > 0)) {
//                return false;
//            }else{
//                return false;
//            }
            public static String checkAge(int a) {
                if ( a >= 18){
                    return "Ви є дорослою людиною";
                }else {
                    return "Ви не є дорослою людиною";
                }
            }
        }
