package org.montanajr.lab10.strategy;

public class Odejmowanie implements Strategia
{
	
   public int operacja(int liczba1, int liczba2) 
   {
      return liczba1 - liczba2;
   }
}