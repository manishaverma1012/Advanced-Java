package com.OOPS;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();//follow insertion order
        LinkedList<Integer> linkedlist=new LinkedList<>();//maintain insertion order
        HashMap<Integer,String> map=new HashMap<>();//doesnot maintains insertion order ,implements map interface
        HashSet<Integer> set=new HashSet<>();//implements set interface use the hashing mechanishm to store data
        TreeMap<Integer,String> treemap=new TreeMap<>();//maintains sorted order
        TreeSet<Integer> treeset=new TreeSet<>();//maintains sortted order
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();//maintains insertion order
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();// maintains insertion order


//        set.add(1);
//        set.add(null);
//        set.add(1);
//        set.add(4);
//        set.add(5);
//        set.add(null);
//        set.add(null);
//        System.out.println(set);


//        treeset.add(8);//TreeSet is being implemented using a binary search tree, which is self-balancing just like a Red-Black Tree. Therefore, operations such as a search, remove, and add consume O(log(N)) time.
//        treeset.add(4);
//        treeset.add(6);
//        treeset.add(7);
//        treeset.add(7);
//        Set synset=Collections.synchronizedSet(treeset);
////        treeset.add(null);//it will give null pointer exception , it doesnot accept null value inside it
//        System.out.println(treeset);

//        Map synmap=Collections.synchronizedMap(map);
//        map.put(1,"Aman");
//        map.put(4,"Ajay");
//        map.put(6,"Manisha");
//        map.put(9,"Karishma");
//        map.put(null,"ANSH");
//        map.put(4,null);
//        map.put(9,null);
//        map.put(null,"Adhikar");
//        System.out.println(map);
//        for(Map.Entry<Integer,String> item:map.entrySet())
//        {
//            System.out.println(item.getKey() +" " + item.getValue());
//        }

//        treemap.put(null,"String");null pointer exception
//        treemap.put(9,null);
//        treemap.put(9,"String");
//        treemap.put(1,"String");
//        System.out.println(treemap);



    }

}
