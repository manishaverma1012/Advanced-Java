package com.java.java8features;


interface R1
{
    default void trash()
    {
        System.out.println("got to hell");
    }

}
@java.lang.FunctionalInterface
interface funinterface extends R1{
    public void sleep();

}
public class functionalInterface{
    public static void main(String[] args) {
        funinterface f= ()->{
            System.out.println("Hello world");
        };
        f.sleep();
        f.trash();

    }


}
