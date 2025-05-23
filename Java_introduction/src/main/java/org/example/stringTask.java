package org.example;
import java.util.regex.*;

public class stringTask {
    public static void main(String[] args) {
        repeatEnd(3, "Hello");
        repeatEnd(2, "Hello");
        repeatEnd(1, "Hello");
        mixString("asdasdzxcasd1qw23123123", "xcvcxvop");
        xyzMiddle("AAxyzBB");
        xyzMiddle("AxyzBB");
        xyzMiddle("AxyzBBB");
        zipZap("zipXzap");
        zipZap("zopzop");
        zipZap("zzzopzop");
        xyzThere("abcxyz");
        xyzThere("abc.xyz");
        xyzThere("xyz.abc");
    }

    public static void repeatEnd(int number, String word) {
        String result = word.substring(word.length() - number);
        for (int i = 0; i < number; i++) {
            System.out.print(result);
        }
    }

    public static void mixString(String phrase1, String phrase2) {
        StringBuffer resultPhrase = new StringBuffer();
        char neededChar;
        int stringLenght = Math.min(phrase1.length(),phrase2.length());
        for (int i = 0; i < stringLenght; i++) {
            neededChar = phrase1.charAt(i);
            resultPhrase.append(neededChar);
            neededChar = phrase2.charAt(i);
            resultPhrase.append(neededChar);
        }
        if (phrase1.length()>stringLenght) {
            resultPhrase.append(phrase1.substring(stringLenght));
        }else {
            resultPhrase.append(phrase2.substring(stringLenght));
        }
        System.out.println("\n" + resultPhrase);
    }
    public static void xyzMiddle(String string1) {
        int firstCharResult = Math.abs(-string1.indexOf('x'));
        int lastCharResult = (string1.length()-1) - string1.indexOf('z');
        int result = firstCharResult - lastCharResult;
        if (string1.contains("xyz")){
            if (result > 1 || result < -1){
                System.out.println("false");
            }
            else {
                System.out.println("true");
            }
            }
        else {
            System.out.println("false");
        }
    }
    public static void zipZap(String string2) {
        String result;
        result = string2.replaceAll("z.p","zp");
        System.out.println(result);
    }
    public static void xyzThere(String containsXYZ) {
        int indexOfX = containsXYZ.indexOf("x");
        int isThereDot = containsXYZ.indexOf(".");
        int indexResult = indexOfX - isThereDot;
        if (containsXYZ.contains("xyz") && !(indexResult == 1)){
            System.out.println(true);
        }else System.out.println(false);
    }
}
