package org.montanajr.lab05.zad02;

public class Bicycle implements Equipment {
    private Double price = 25d;
    private String name = "Bycicle";
    private Integer offerQuantity = 18;

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
        final StringBuffer sb = new StringBuffer("Bicycle{");
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
