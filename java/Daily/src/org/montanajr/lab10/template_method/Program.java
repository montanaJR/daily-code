package org.montanajr.lab10.template_method;

public class Program 
{
	public static void main(String[] args) 
	{
		Mecz mecz = new Tenis();
	    mecz.rozgrywka();
	    System.out.println();
	    
	    mecz = new Pilka_nozna();
	    mecz.rozgrywka();	
	}

}
