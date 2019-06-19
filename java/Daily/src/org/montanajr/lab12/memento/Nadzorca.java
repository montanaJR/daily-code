package org.montanajr.lab12.memento;


public class Nadzorca 
{
	Object pamiatka;

	public void zapiszStan(StanDiety stanDiety) 
	{
		pamiatka = stanDiety.zapisz();
	}

	public void przywrocStan(StanDiety stanDiety)
	{
		stanDiety.przywroc(pamiatka);
	}

}
