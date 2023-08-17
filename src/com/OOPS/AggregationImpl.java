package com.OOPS;

class Person
{
    String name;
    int id;
    Address address;//has a relation ship
    public Person(String name, int id, Address address)
    {
        this.name=name;
        this.id=id;
        this.address=address;
    }
    public void display()
    {
        System.out.println(address.city +" "+ address.street +" "+ address.pincode);
        System.out.println(id+" "+ name);
    }
}
class Address
{
    int pincode;
    String street;
    String city;
    Address(int i, String street, String c)
    {
        this.pincode=i;
        this.street=street;
        this.city=c;
    }
}
public class AggregationImpl {
    public static void main(String[] args) {
        Address ad=new Address(4,"Shiv katra","Kanpur");
        Person p=new Person("Mnaisha",4,ad);
        p.display();
    }

}
