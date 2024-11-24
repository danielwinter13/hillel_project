
package org.example;


public class Main {
    public static void main(String[] args) {
        //squareNum (3);
        //volumeCount(2.3, 4);
        ascensionCount(2,3);
    }
    public static void squareNum(int a) {
        System.out.println("Введіть ціле число:" + a);
        System.out.println("Квадрат числа дорівнює "  + (a*a));
    }
    public static void volumeCount(double a, double b) {
        System.out.println("Об'єм циліндру з радіусом " + a + " та висотою " + b + " дорівнює " + (a * b));
    }
    public static void ascensionCount(int a, int b) {
        System.out.println("Введіть a:" + a + "\n" + "Введіть b:" + b + "\n" + "Результат " + a + "^" + b + " дорівнює " + (int)Math.pow(a,b));
    }
}