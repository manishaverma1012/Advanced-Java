package com.java.java8features;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
    String name;
    int id;
    int age;
    public Product(String name, int id, int age)
    {
        super();
        this.name=name;
        this.id=id;
        this.age=age;
    }

}

public class Lambdafiltercollection {


    public static void main(String[] args) {
        List<Product> list= new ArrayList<Product>();
        list.add(new Product("Ram", 4, 23));
        list.add(new Product("shyam", 5, 25));
        list.add(new Product("jam", 6,62));

        //filter data

        List<Product> result=list.stream().filter(p->p.age>23).collect(Collectors.toList());
        result.forEach(p-> System.out.println(p.name+" "+ p.id));

    }

}
