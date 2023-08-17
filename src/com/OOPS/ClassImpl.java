package com.OOPS;
 class Node {
     private int i;
     private int j;

     Node(int i, int j) {
         this.i = i;
         this.j = j;
     }

     public void getvalue() {
         System.out.println(i + j);

     }
 }
public class ClassImpl {



    public static void main(String[] args) {
        Node node=new Node(4,6);

        node.getvalue();
    }
}

