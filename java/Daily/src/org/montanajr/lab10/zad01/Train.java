package org.montanajr.lab10.zad01;

public class Train extends Trip {
	
    @Override
    void setTime(Integer dist) {
    	
        System.out.println((dist / 100) +" Hours");
    }

    @Override
    void setPrice(Integer dist) {
    	System.out.println("Price: " + (0.8 * dist) + "PLN");
    }

    @Override
    void getCities(String... cities) {
        for(String s: cities){
            System.out.println(s + "\t");
        }
    }
}
