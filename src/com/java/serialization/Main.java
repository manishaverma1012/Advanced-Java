package com.java.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            // sserialization
//            Student s=new Student(4,"Manisha");
//            FileOutputStream f=new FileOutputStream("file.txt");
//            ObjectOutputStream obj=new ObjectOutputStream(f);
//            obj.writeObject(s);
//            obj.flush();
//            obj.close();
//            System.out.println("Success");

            // deserializzation
            ObjectInputStream obj=new ObjectInputStream(new FileInputStream("file.txt"));
            Student s=(Student)obj.readObject();
            System.out.println(s.id+" "+ s.name);
            obj.close();
            System.out.println("success");
        }
        catch(Exception e)
        {
            System.out.println("error occurred");

        }




    }
}
