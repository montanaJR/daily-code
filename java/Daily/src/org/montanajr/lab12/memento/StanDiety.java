package org.montanajr.lab12.memento;

public class StanDiety 
{
	String nazwisko;
	int numerDnia;
	int waga;

	public StanDiety(String nazwisko, int numerDnia, int waga) 
	{
		this.nazwisko = nazwisko;
		this.numerDnia = numerDnia;
		this.waga = waga;
	}

	public String toString() 
	{
		return "Nazwisko: " + nazwisko + ", numer dnia: " + numerDnia + ", waga: " + waga;
	}

	public void ustawNumerDniaiWage(int numerDnia, int waga) 
	{
		this.numerDnia = numerDnia;
		this.waga = waga;
	}

	public Memento zapisz() 
	{
		return new Memento(nazwisko, numerDnia, waga);
	}

	public void przywroc(Object obiektPamiatki) 
	{
		Memento pamiatka = (Memento) obiektPamiatki;
		nazwisko = pamiatka.pamiatkaNazwiskaOsoby;
		numerDnia = pamiatka.pamiatkaNumeruDnia;
		waga = pamiatka.pamiatkaWagi;
	}

	
	private class Memento 
	{
		String pamiatkaNazwiskaOsoby;
		int pamiatkaNumeruDnia;
		int pamiatkaWagi;

		public Memento(String nazwisko, int numerDnia, int waga) 
		{
			pamiatkaNazwiskaOsoby = nazwisko;
			pamiatkaNumeruDnia = numerDnia;
			pamiatkaWagi = waga;
		}
	}
}
