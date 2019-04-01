package org.montanajr.lab05.proxy;

public class RzeczywistyObraz implements Obraz 
 {
   private String nazwaPliku;

    public RzeczywistyObraz(String nazwaPliku)
    {
	    this.nazwaPliku = nazwaPliku;
	    wczytajZdysku(nazwaPliku);
	}

	public void wyswietl()
	{
	  System.out.println("Wy�wietlanie obiektu " + nazwaPliku);
	}

	private void wczytajZdysku(String nazwaPliku)
	 {
	      System.out.println("Wczytywanie obiektu " + nazwaPliku);
	 }
 }
