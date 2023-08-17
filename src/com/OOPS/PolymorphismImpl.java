package com.OOPS;

import java.io.IOException;

class MethodOverloading
{
    public void add(int x,int y)
    {
        System.out.println(x+y);
    }
    public void add(double x,double y)
    {
        System.out.println(x+y);
    }

}
class Aman
{
    public void display() throws IOException
    {
        System.out.println("yes");
    }
}
class Manisha extends Aman
{
    public void display()
    {
        System.out.println("No");
    }
}

public class PolymorphismImpl {
    public static void main(String[] args) {
        Aman a=new Manisha();
        try {
            a.display();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
