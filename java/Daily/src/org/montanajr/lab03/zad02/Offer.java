package org.montanajr.lab03.zad02;

public abstract class Offer implements Cloneable{

    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract String getOfferName();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

}
