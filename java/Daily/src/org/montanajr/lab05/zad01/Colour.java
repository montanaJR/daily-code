package org.montanajr.lab05.zad01;

public abstract class Colour {
    protected String type = "KOLOR";
    protected double price;

    public String getType(){
        return type;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Colour{");
        sb.append("type='").append(type).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
