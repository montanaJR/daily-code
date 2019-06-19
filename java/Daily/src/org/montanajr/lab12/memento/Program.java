package org.montanajr.lab12.memento;

public class Program {

	public static void main(String[] args) 
	{
		
		Nadzorca nadzorca = new Nadzorca();

		StanDiety stanDiety = new StanDiety("Krzysztof Kowalczyk", 1, 100);
		System.out.println(stanDiety);

		stanDiety.ustawNumerDniaiWage(2, 99);
		System.out.println(stanDiety);

		System.out.println("Zapisuj� stan!");
		nadzorca.zapiszStan(stanDiety);

		stanDiety.ustawNumerDniaiWage(3, 98);
		System.out.println(stanDiety);

		stanDiety.ustawNumerDniaiWage(4, 100);
		System.out.println(stanDiety);

		System.out.println("Przywracam zapisany stan!");
		nadzorca.przywrocStan(stanDiety);
		System.out.println(stanDiety);

	}

}
