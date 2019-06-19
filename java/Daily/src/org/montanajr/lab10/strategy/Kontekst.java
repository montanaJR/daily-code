package org.montanajr.lab10.strategy;

public class Kontekst
{
   private Strategia strategia;

   public Kontekst(Strategia strategia)
   {
     this.strategia = strategia;
   }

   public int wykonanieStrategii(int liczba1, int liczba2)
   {
	  return strategia.operacja(liczba1, liczba2);
   }
}
