package com.java.ExceptionhANDLING;

public class Finalize1 {


    public static void main(String[] args) {
        Finalize1 f=new Finalize1();
        System.out.println(f.hashCode());
        f=null;
        System.gc();
        System.out.println("final result");
        System.out.println(f.hashCode());


    }

    protected void Finalize()
    {
        System.out.println("finalize will work");

    }
}
