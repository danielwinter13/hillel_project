package org.example;

import java.net.InterfaceAddress;
import java.util.*;

public class CollectionTask {
    public static void main(String []arg){
        Set<String> userInfo = new LinkedHashSet<>();
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(3);
        numbers.add(14);
        numbers.add(7);
        numbers.add(5);
        numbers.add(1);
        System.out.println(numbers.add(1));
        userInfo.add("Danylo");
        userInfo.add("Zyma");
        System.out.println(userInfo.add("Zyma"));
        userInfo.add("Testovych");
        System.out.println(userInfo);
        System.out.println(numbers);
        Map<String, Integer> cities = new HashMap<>();
        cities.put("kyiv", 1);
        cities.put("zhytomyr", 2);
        cities.put("odesa", 3);
        cities.put("vynnytsa", 4);
        cities.put("kharkiv", 5);
        System.out.println(cities);
    }
}
