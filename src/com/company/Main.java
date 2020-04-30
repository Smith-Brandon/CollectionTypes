package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List listA = new ArrayList();

        listA.add("a");
        listA.add("b");
        listA.add("c");

        for (Object x : listA) {
            System.out.println((String)x);
        }

        Map mapA = new HashMap();
        mapA.put(1, "A");
        mapA.put(2, "B");
        mapA.put(3, "C");

        for (int i = 1; i < 4; i++) {
            String output = (String)mapA.get(i);
            System.out.println(output);
        }
    }
}
