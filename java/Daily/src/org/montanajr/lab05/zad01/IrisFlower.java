package org.montanajr.lab05.zad01;

public class IrisFlower extends Flower {


    public IrisFlower(Colour colour) {
        super(colour);
        colour.price = setPrice();
    }

    @Override
    void getInfo() {
        System.out.println(String.format("Kwiatek Irys o kolorze %s w cenie %s", colour.getType(), colour.getPrice()));
    }

    double setPrice(){
        return colour.price + 1d;
    }


}
