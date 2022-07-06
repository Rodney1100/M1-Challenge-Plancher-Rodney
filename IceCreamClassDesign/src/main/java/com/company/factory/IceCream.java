package com.company.factory;

public class IceCream {
    private int temperature;
    private double price;
    private String flavor;
    private double pricePerPound;
    private boolean doesHaveNuts;
    private double weight;

    @Override
    public String toString(){
        return "IceCream{" +
                "temperature=" + temperature +
                ", flavor='" + flavor + '\'' +
                ", doesHaveNuts=" + doesHaveNuts +
                ", weight=" + weight +
                '}';
    }
    public double getPrice() {
        return price;
    }
      public double setPrice(double pricePerPound, double weight) {
        this.price = weight * pricePerPound / 5;
        System.out.println(this.price);
        return this.price;
    }
    public int getTemperature() {
        return temperature;
    }
    public int setTemperature(int temperature) {
        this.temperature = temperature;
        if (this.temperature > 35) {
            System.out.println("This is ICE CREAM --- Temperature needs to be below 35 Degree!!");
        } else {
            System.out.println("Your doing GREAT on the Temperature");
        }
          return this.temperature;
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public boolean setDoesHaveNuts(boolean doesHaveNuts) {
        if (doesHaveNuts) {
            doesHaveNuts = true;
        } else {
            doesHaveNuts = false;
        }
        this.doesHaveNuts = doesHaveNuts;
        System.out.println("doesHaveNuts  " + doesHaveNuts);
        return doesHaveNuts;
    }
}
