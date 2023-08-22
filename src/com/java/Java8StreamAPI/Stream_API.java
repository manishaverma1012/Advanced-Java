package com.java.Java8StreamAPI;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Stream_API {
//    Q1. Print the avg age of all the people
//    Ans1: Double result= people.stream().collect(Collectors.averagingInt(Person::getAge));
    //---------------------------------------------------------------------------
//Q2. Create a list of all the people who are either greater than 20 or contain any vowel in their name (uppercase or lowercase)
// Ans2: List<Person> result= people.stream().filter(p->p.getAge()>20 || containsVowel(p.getName())).collect(Collectors.toList());
public static boolean containsVowel(String name)
{
    for (char c : name.toLowerCase().toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
    }
    return false;
}
    //-----------------------------------------------------------------------------
    // Q3. Create a list of people, sorted in ascending order on the basis of age, if age is the same then sort in descending order of name
    // Ans: List<Person> sortedPeople = people.stream()
    //                .sorted(Comparator.comparingInt(Person::getAge).thenComparing(Comparator.comparing(Person::getName).reversed()))
    //                .collect(Collectors.toList());
    //        System.out.println(sortedPeople);

    //q4: Create a map from this people list where the key is country name and value is count which means a map will tell how many people live in a particular country
    //ans: Map<String, Long> map= people.stream()
    //                .collect(Collectors.groupingBy(Person::getCountry, Collectors.counting()));
    //        System.out.println(map);

    //q:5 Create a map which stores avg age of people per country (key should be country and value should be average age i.e, double)
//Map<String, Double> map= people.stream().collect(Collectors.groupingBy(Person::getCountry,Collectors.averagingDouble(Person::getAge)));
//        System.out.println(map);

    //q6:Print the oldest person in every country
//    Map<String, Optional<Person>> oldestPersonByCountry = people.stream()
//            .collect(groupingBy(Person::getCountry, maxBy(Comparator.comparing(Person::getAge))));


 //q7:Map.Entry<String, Long> mostPopulatedCountry = people.stream()
    //                .collect(Collectors.groupingBy(Person::getCountry, Collectors.counting()))
    //                .entrySet().stream()
    //                .max(Comparator.comparingLong(Map.Entry::getValue))
    //                .get();
    //        System.out.println(mostPopulatedCountry.getKey());

    //q8Create a list of 20 random integers in the range 0 - 1000 using Java 8 streams

//    Random rd=new Random();
//    List<Integer> randomInteger= IntStream.range(0, 20).map(i->rd.nextInt(1001)).boxed().collect(toList());//boxed is used to convert int to integers
//        System.out.println(randomInteger);

}
