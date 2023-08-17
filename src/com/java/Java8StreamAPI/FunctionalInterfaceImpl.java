package com.java.Java8StreamAPI;


@FunctionalInterface
    interface sayable{
        void say(String msg);   // abstract method
        // It can contain any number of Object class methods.
        int hashCode();
        String toString();
        boolean equals(Object obj);
    }

    interface B extends sayable{//cant extend when parent interface has abstract mathod;
        void nah();

    }
    public class FunctionalInterfaceImpl{

        public static void main(String[] args) {
            sayable fie = (msg)->{
                System.out.println("message will be here"+msg);};

            fie.say("Hello there");
        }
    }

