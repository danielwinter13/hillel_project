package org.example;

public class stringTask {
    public static void main(String[] args) {
        repeatEnd(3, "testasdasd");
    }
    public static void repeatEnd(int number,String word){
        String result;
        for (int i = 0; i <= number; i++){
            result = word.substring(number);
            System.out.print(result);
        }
    }
}
