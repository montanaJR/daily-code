package org.montanajr.lab12.state;

public class Niewyciszony implements StanDzwonka 
{
   public void dzwon(KontekstStanu kontekst) 
	{
		System.out.println("dzwoni - odtwarzana ustawiona melodia ...");
	}

}
