package org.montanajr.lab03.zad02;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        OfferCache.loadCache();

        Offer clonedOffer1 = (Offer) OfferCache.getOffer("mix");
        System.out.println(String.format("Offer 1: %s", clonedOffer1.getType()));

        Offer clonedOffer2 = (Offer) OfferCache.getOffer("contract");
        System.out.println(String.format("Offer 2: %s", clonedOffer2.getType()));

        Offer clonedOffer3 = (Offer) OfferCache.getOffer("prepaid");
        System.out.println(String.format("Offer 3: %s", clonedOffer3.getType()));
    }
}
