package org.montanajr.lab10.template_method;

public class Tenis extends Mecz 
{
    void zakonczenieGry() 
    {
	   System.out.println("Koniec meczu!");
	}

	void ustalenia() 
	{
	  System.out.println("Dokonano losowania stron. Wylosowano zawodnika rozpoczynaj�cego serwis.");
	}

	void rozpoczecieGry() 
	{
	      System.out.println("Pocz�tek meczu. Pierwszy gem! Serwis...");
	}
}
