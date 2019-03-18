package org.montanajr.lab03.zad02;

public class Contract extends Offer {

    public Contract(){
        type = "Form: Contract; (Abonament)";
    }
    @Override
    public String getOfferName() {
        return "contract";
    }
}
