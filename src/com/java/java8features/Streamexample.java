package com.java.java8features;
import java.util.*;
import java.util.stream.Stream;

class Product1{
    int id;
    String name;
    float price;
    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Streamexample {
    public static void main(String[] args) {
//        List<Product1> list=new ArrayList<Product1>();
//        list.add(new Product1(1,"Manisha", 34.9f));
//        list.add(new Product1(2,"Aman", 35.9f));
//        list.add(new Product1(3,"Ajay",54.7f));
//        list.stream().filter(p->p.name=="Ajay").forEach(p-> System.out.println(p.id));


        Stream.iterate(1,item->item+1).filter(item->item%5==0).limit(10).forEach(System.out::println);
    }

}
