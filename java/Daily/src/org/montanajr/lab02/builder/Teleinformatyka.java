package org.montanajr.lab02.builder;

/**
 * Tak samo, jak programowanie
 * Tylko inny produkt wynnikowy
 */
public class Teleinformatyka extends Builder
{
	public void proponujPrzedmiot1()
	{
		plan.setPrzedmiot1("Eksploatacja systemów i sieci");
	}
	public void proponujPrzedmiot2()
	{
		plan.setPrzedmiot2("Telekomunikacja bezprzewodowa");
	}
	
	public void proponujPrzedmiot3()
	{
		plan.setPrzedmiot3("Zaawansowane technologie sieciowe");	
	}
}
