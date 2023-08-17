package com.java.Java8StreamAPI;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
//        List<Person> people = Arrays.asList(
//                new Person(20, "John", "USA"),
//                new Person(35, "Sam", "Italy"),
//                new Person(15, "Jamie", "England"),
//                new Person(30, "Robert", "Italy"),
//                new Person(20, "James", "Ireland"),
//                new Person(25, "Peter", "USA"),
//                new Person(5, "Jessica", "Norway"),
//                new Person(40, "Roger", "Netherlands"),
//                new Person(50, "Jim", "USA")
//        );


        Random rd=new Random();
        List<Integer> randomInteger= IntStream.range(0, 20).map(i->rd.nextInt(1001)).boxed().collect(toList());//boxed is used to convert int to integers
        System.out.println(randomInteger);



    }



}
