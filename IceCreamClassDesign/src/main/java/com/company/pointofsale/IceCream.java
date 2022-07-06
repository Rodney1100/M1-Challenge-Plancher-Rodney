package com.company.pointofsale;

public class IceCream {
    private int id;
    private double price;
    private String name;
    private String flavor;



    public IceCream(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    @Override
    public String toString() {
        return "IceCream{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }




}
