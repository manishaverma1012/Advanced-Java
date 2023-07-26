package com.java.java8features;
import java.util.*;

@java.lang.FunctionalInterface
interface functionalinterface
{  public int add(int x, int y);//return type, parameterazied, non- parametre
}

public class LamdaExpression {
    public static void main(String[] args) {
//        functionalinterface f= (x,y)->{
//            int sum=x+y;
//            return sum;
//
//        };
//        int s=f.add(4,5);
//        System.out.println(s);

    //creating threads
    Runnable r1=()->{
        System.out.println( " thread r1 is running");
    };
    Thread t1=new Thread(r1);
    t1.start();

    }
}
