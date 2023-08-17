package com.OOPS;
class Animal
{
    public void eat()
    {
        System.out.println("eating");
    }
}
class Dog extends Animal{
    @Override
    public void eat()
    {
        System.out.println("Who is eating");
    }
//    public void bark()
//    {
//        System.out.println("Barking");
//    }
}

public class InheritenceImpl {
    public static void main(String[] args) {
        Animal d=new Dog();
//        d.bark();
        d.eat();
        d.eat();
    }

}
