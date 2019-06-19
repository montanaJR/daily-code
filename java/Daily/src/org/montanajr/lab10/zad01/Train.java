package org.montanajr.lab10.zad01;

public class Train extends Trip {
    @Override
    void setTime() {
        System.out.println("22 hours 10 mins");
    }

    @Override
    void setPrice() {
        System.out.println("Price: 90$");
    }

    @Override
    void getCities(String... cities) {
        for(String s: cities){
            System.out.println(s + "\t");
        }
    }
}
