package org.montanajr.lab03.zad02;

public class FactoryCreator {

    public static AbstractFactory getFactory(String factoryName){
        if(factoryName.equalsIgnoreCase("offer")){
            return new OfferFactory();
        } else {
            throw new IllegalArgumentException("Wrong factory");
        }
    }
}
