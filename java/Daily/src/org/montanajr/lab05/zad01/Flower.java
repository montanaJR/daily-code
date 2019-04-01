package org.montanajr.lab05.zad01;

public abstract class Flower {
   protected Colour colour = null;
   public double price = 0d;

    public Flower(Colour colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return colour.getPrice();
    }

    abstract void getInfo();


}
