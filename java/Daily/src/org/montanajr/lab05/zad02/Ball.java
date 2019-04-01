package org.montanajr.lab05.zad02;

public class Ball implements Equipment {

    private Double price = 9d;
    private String name = "Ball";
    private Integer offerQuantity = 330;

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String printStatus() {
        final StringBuffer sb = new StringBuffer("Ball{");
        sb.append("price=").append(price);
        sb.append(", name='").append(name).append('\'');
        sb.append(", offerQuantity=").append(offerQuantity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Integer offerQuantity() {
        return offerQuantity;
    }


}
