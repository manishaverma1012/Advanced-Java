package com.OOPS;

abstract class abstraction
{
    int slow=0;
//    abstract void eat();
    void def()
    {
        System.out.println("dont know");
    }
}
abstract class Extented extends abstraction
{
    void eat()
    {
        System.out.println("eating");
    }
    abstract void eat2();// if you dont want to give the implementation of the method you have to declare this class as abstract class and method as abstract method
}
class M extends Extented{
    void eat2()
    {
        System.out.println("eating 2");
    }


}
//abstract class Add
//{
//    public abstract void add();
//    public void sample()
//    {
//        System.out.println("Hello");
//    }
//    public abstract void multiple();
//
//}
//abstract class ImplClass extends Add
//{
//    public void add()
//    {
//        System.out.println("Addition");
//    }
//    public abstract void swim();
//
//}



public class AbstractionImpl {
}
