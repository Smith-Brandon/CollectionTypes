package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*Collections and Maps*/
        /*Collections are ArrayList, TreeSet and LinkedList*/
        List listA = new ArrayList();

        listA.add("a");
        listA.add("b");
        listA.add("c");
        System.out.println("abc was entered into the ArrayList");
        for (Object x : listA) {
            System.out.println((String)x);
        }
        System.out.println("And it prints in that exact order");
        System.out.println("TREES was entered into the TreeSet.");
        Set TreeSetA = new TreeSet();
        TreeSetA.add("T");
        TreeSetA.add("R");
        TreeSetA.add("E");
        TreeSetA.add("E");
        TreeSetA.add("S");

        for (Object x : TreeSetA) {
            System.out.println((String)x);
        }
        System.out.println("This shows how a TreeSet sorts input in alphabetical");
        System.out.println("and overwrites identical entries");

        System.out.println("LINK was entered into a LinkedList");
        LinkedList LinkListA = new LinkedList();
        LinkListA.add("L");
        LinkListA.add("I");
        LinkListA.add("N");
        LinkListA.add("K");

        for (Object x : LinkListA) {
            System.out.println((String)x);
        }
        System.out.println("And it is printed correctly");
        /*Maps are HashMap and TreeMap*/
        Map mapA = new HashMap();
        mapA.put(1, "H");
        mapA.put(2, "A");
        mapA.put(3, "S");
        mapA.put(4, "H");
        System.out.println("HASH was entered into a HashMap");
        for (int i = 1; i < 5; i++) {
            String output = (String)mapA.get(i);
            System.out.println(output);
        }
        System.out.println("As you can see everything was printed correctly");
        Map mapB = new TreeMap();
        mapB.put(1, "T");
        mapB.put(2, "R");
        mapB.put(3, "E");
        mapB.put(4, "E");
        System.out.println("TREE was entered into a TreeMap");
        for (int i = 1; i < 5; i++) {
            String output = (String)mapB.get(i);
            System.out.println(output);
        }
        System.out.println("As you can see everything was printed correctly");

    }
}
