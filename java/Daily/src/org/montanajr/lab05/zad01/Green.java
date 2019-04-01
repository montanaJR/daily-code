package org.montanajr.lab05.zad01;

public class Green extends Colour{

    public Green(Double p){
        this.price = p;
        this.type = "green";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Green{");
        sb.append("type='").append(type).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
