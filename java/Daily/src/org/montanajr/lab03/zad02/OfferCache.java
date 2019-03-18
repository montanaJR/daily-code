package org.montanajr.lab03.zad02;

import java.util.Hashtable;

public class OfferCache {

    private static Hashtable<String, Offer> offerMap  = new Hashtable<>();

    public static Offer getOffer(String offerName){
        Offer cachedOffer = offerMap.get(offerName);
        return (Offer) cachedOffer.clone();
    }

    public static void loadCache(){
        Mix mix = new Mix();
        Prepaid prepaid = new Prepaid();
        Contract contract = new Contract();


        offerMap.put(mix.getOfferName(), mix);
        offerMap.put(prepaid.getOfferName(), prepaid);
        offerMap.put(contract.getOfferName(), contract);
    }

}
