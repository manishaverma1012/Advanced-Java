package com.OOPS;
class Encapsule
{
    private  String name;
    private int id;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class EncapsulationImpl {
    public static void main(String[] args) {
        Encapsule E=new Encapsule();
        E.setCity("Kanpur");
        System.out.println(E.getCity());
    }
}
