package org.montanajr.lab09.mediator;

public interface ChatMediator 
{
	public void wyslijWiadomosc(String komunikat, Uzytkownik uzytkownik);
	void dodajUzytkownika(Uzytkownik uzytkownik);
}