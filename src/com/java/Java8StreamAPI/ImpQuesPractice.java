package com.java.Java8StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImpQuesPractice {


    class Sample1 {
        public static void main(String[] args) {
//        String s1="ABC";
//        String s2=new String("ABC");
//        String s3="ABC";
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s2));

//        TreeMap<Integer,String> map=new TreeMap<>();
//        map.put(1,"A");
//        map.put(2,"C");
//        map.put(null,"D");
//        map.put(null,"P");
//        System.out.println(map);

            List<Integer> list = new ArrayList();
            list.add(2);
            list.add(4);
            list.add(5);
            list.add(8);
            list.add(9);
            Predicate<Integer> p = item -> item % 2 == 0;
            list.stream().filter(p).map(item -> item * item).collect(Collectors.toList());
//        Predicate <Integer> p= item-> item%2>0 ;


        }
    }

    class A {

        //    static int x;
//    int y;
        static {
            System.out.println("Hi");
        }

        static void print() {
            System.out.println("Hola");
        }

        public static void main(String[] args) {
            System.out.println("Hello");

        }

        static {
            System.out.println("HI, Hello");
        }
    }




}
