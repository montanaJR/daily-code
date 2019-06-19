package org.montanajr.lab10.zad02;


public class Context {
	private Strategy strategia;

	   public Context(Strategy strategia)
	   {
	     this.strategia = strategia;
	   }

	   public String runStrategy(String input)
	   {
		  return strategia.run(input);
	   }
}
