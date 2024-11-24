
package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(getGrade(5));
        System.out.println(getGrade(1));
        System.out.println(getGrade(-3));
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