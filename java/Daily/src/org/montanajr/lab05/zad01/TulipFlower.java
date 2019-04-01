package org.montanajr.lab05.zad01;

public class TulipFlower extends Flower {

    public TulipFlower(Colour colour) {
        super(colour);
    }

    @Override
    void getInfo() {
        System.out.println(String.format("Kwiatek Tulipan o kolorze %s w cenie %s", colour.getType(), colour.getPrice()));
    }


}
