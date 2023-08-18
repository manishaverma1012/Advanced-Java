package com.java.ExceptionhANDLING;

public class ExceptionHandlingImpl {
    public static void main(String args[]){
        try{
            int arr[]=new int[5];
            int data=100/0;
            arr[10]=10;
            //code that may raise exception
//            int data=100/0;
            System.out.println("this will not work");//this will not work
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)

        {
            System.out.println(e);
        }
        //rest code of the program
        System.out.println("rest of the code...");
    }
}
