package org.montanajr.lab10.zad01;

public class Bus extends Trip {
    @Override
    void setTime() {
        System.out.println("17 hours 30 mins");
    }

    @Override
    void setPrice() {
        System.out.println("Price: 40$");
    }
    @Override
    void getCities(String... cities) {
        for(String s: cities){
            System.out.println(s + "\t");
        }
    }
}
