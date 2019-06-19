package org.montanajr.lab12.state;

public class KontekstStanu 
{
	private StanDzwonka aktualnyStan;

	public KontekstStanu() 
	{
		aktualnyStan = new Wibracje();
	}

	public void ustawStan(StanDzwonka stan) 
	{
		aktualnyStan = stan;
	}

	public void dzwon() 
	{
		aktualnyStan.dzwon(this);
	}
}
