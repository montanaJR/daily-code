package org.montanajr.lab02.builder;

/**
 * Konkretny budowniczy
 * Musi dziedziczyc po biilderze
 */
public class Programowanie extends Builder 
{
	public void proponujPrzedmiot1()
	{
		plan.setPrzedmiot1("Narzędzia CASE");
	}
	public void proponujPrzedmiot2()
	{
		plan.setPrzedmiot2("Hurtowania danych");
	}
	
	public void proponujPrzedmiot3()
	{
		plan.setPrzedmiot3("Zarzdzanie projektami programistycznymi");
	}
}
