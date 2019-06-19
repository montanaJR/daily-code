package org.montanajr.lab10.strategy;

public class Program 
{
	
   public static void main(String[] args) 
   {
	 Kontekst kontekst = new Kontekst(new Dodawanie());		
	 System.out.println("53 + 6 = " + kontekst.wykonanieStrategii(53, 6));

	 kontekst = new Kontekst(new Odejmowanie());		
	 System.out.println("53 - 6 = " + kontekst.wykonanieStrategii(53, 6));

	 kontekst = new Kontekst(new Mnozenie());		
	 System.out.println("53 * 6 = " + kontekst.wykonanieStrategii(53, 6));
   }
}