package org.montanajr.lab09.observer;

public class Program 
{
	
	public static void main(String[] args)
	{
		Konfigurator c = new KonfiguratorAplikacji();
		ObserwatorKonfiguracji o1 = new ObserwatorKonfiguracji();
		ObserwatorKonfiguracji o2 = new ObserwatorKonfiguracji();
		
		System.out.println("Dodanie pierwszego obserwatora");
		c.dodaj(o1);
		((KonfiguratorAplikacji) c).ustawKonfiguracje("Uprawnienia", "Dostep dla wszystkich");
		c.powiadomObserwatorow();
		System.out.println("-------------------------");
		
		System.out.println("Dodanie drugiego obserwatora");
		c.dodaj(o2);
		((KonfiguratorAplikacji) c).ustawKonfiguracje("Uprawnienia", "Dostep zabroniony");
		c.powiadomObserwatorow();
		System.out.println("-------------------------");
		
		System.out.println("Usuniecie pierwszego obserwatora");
		c.usun(o1);
		((KonfiguratorAplikacji) c).ustawKonfiguracje("Uprawnienia", "Tylko autoryzowany dostep");
		c.powiadomObserwatorow();
	}

}
