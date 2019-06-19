package org.montanajr.lab09.mediator;

public abstract class Uzytkownik 
{
	protected ChatMediator mediator;
	protected String nazwa;
	
	public Uzytkownik(ChatMediator med, String nazwa)
	{
	  this.mediator=med;
	  this.nazwa=nazwa;
	}
	
	public abstract void wyslij(String komunikat);
	
	public abstract void odbierz(String komunikat);
}