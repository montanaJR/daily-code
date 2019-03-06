package org.montanajr.lab03.singleton;

public class BuforWydruku {

	private static BuforWydruku bufor;
	private static int licz;

    private BuforWydruku() {  
    	
    }
    

    public static synchronized BuforWydruku getSpooler() {
        if (bufor == null)
           bufor =  new BuforWydruku();
        	  
        BuforWydruku.licz++;	
        return bufor;
    }

    protected void print(String s) {
        System.out.println(s + "na drukarce " + licz);
    }
}
