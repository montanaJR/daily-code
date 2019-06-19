package org.montanajr.lab09.mediator;

public class UzytkownikImpl extends Uzytkownik
{

	public UzytkownikImpl(ChatMediator med, String nazwa) 
	{
		super(med, nazwa);
	}

	
	public void wyslij(String komunikat)
	{
		System.out.println(this.nazwa +": wyslana wiadomosc: "+komunikat);
		mediator.wyslijWiadomosc(komunikat, this);
	}
	
	public void odbierz(String komunikat) 
	{
		System.out.println(this.nazwa +": odebrana wiadomosc to : "+komunikat);
	}

}
