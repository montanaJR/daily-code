package org.montanajr.lab04.zad02;

public class SimpleNapoj implements Napoj {
    private String name;
    private String data;
    private double price;

    public SimpleNapoj(String name) {
        this.name = name;
        data = null;
        price = 0d;
    }

    @Override
    public void addNapoj(Napoj napoj) {

    }

    @Override
    public void addDodatek(Dodatek dodatek) {

    }

    @Override
    public String getName() {
        return name;
    }




    @Override
    public String getData() {
        final StringBuffer sb = new StringBuffer("SimpleNapoj{");
        sb.append("name='").append(name).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        data = sb.toString();

        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
