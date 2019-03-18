package org.montanajr.lab03.zad02;

public class Prepaid extends Offer{

    public Prepaid() {
        type = "Form: Prepaid; (Na kartę)";
    }

    @Override
    public String getOfferName() {
        return "prepaid";
    }
}
