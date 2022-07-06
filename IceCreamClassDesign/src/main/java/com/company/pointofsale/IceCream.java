package com.company.pointofsale;

public class IceCream {
    private int id;
    private double priceInStore;
    private String name;
    private String flavor;

    @Override
    public String toString() {
        return "IceCream{" +
                "id=" + id +
                ", price=" + priceInStore +
                ", name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
//        return this.id;
    }

    public double getPrice() {
        return priceInStore;
    }

    public double setPriceInStore(double priceInInStore) {
        this.priceInStore = (priceInInStore * 1.5);
        return this.priceInStore;
    }

    public String getName() {
        return name;
    }

    public String setName(int inputNameNum) {
        if(id == 1){
            name = "BlueBarry";
            return this.name;
        }else if (id == 2){
            name = "vanilla";
            return this.name;
        }else{
            System.out.println("You need to provide an ID");
        }
        return this.name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
