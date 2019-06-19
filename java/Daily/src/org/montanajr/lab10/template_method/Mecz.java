package org.montanajr.lab10.template_method;

public abstract class Mecz 
{
   abstract void ustalenia();
   abstract void rozpoczecieGry();
   abstract void zakonczenieGry();

   public final void rozgrywka()
   {
      System.out.println("Wyznaczono termin meczu!");
	  ustalenia();
      rozpoczecieGry();
      zakonczenieGry();
   }
}