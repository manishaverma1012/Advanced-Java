package com.OOPS;
interface Implinterface
{
    int min=8;// by defalut public static final
    void eat();
    default void swim()
    {
        System.out.println("swimming");
    }
    static void drink()
    {
        System.out.println("drinking");
    }

}

class Imp implements Implinterface {

     public void eat()
    {
        System.out.println("eating"+min);
    }
}
interface A
{
    void print();
}
interface B extends A
{
    void draw();
}
class M1 implements B{
    public void draw()
    {
        System.out.println("draw");
    }
    public void print()
    {
        System.out.println("print");
    }

}
interface  Another
{
    void a();
    void b();
    void c();
    void d();
    void e();
}
abstract class T implements Another
{
     public void a()
     {
         System.out.println("a");
     }


}
class N extends T{

    @Override
    public void b() {
        System.out.println("b");

    }

    @Override
    public void c() {
        System.out.println("c");

    }

    @Override
    public void d() {
        System.out.println("d");

    }

    @Override
    public void e() {
        System.out.println("e");

    }
}

class InterfaceImpl
{
    public static void main(String[] args) {
//        Imp m=new Imp();
//        m.eat();
//        m.swim();
//        M1 a=new M1();
//        a.draw();
//        a.print();
       Another n=new N();
       n.a();

    }

}
