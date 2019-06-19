package org.montanajr.lab10.template_method;

public class Pilka_nozna extends Mecz 
{
   void zakonczenieGry() 
   {
     System.out.println("Koniec meczu!!");
   }

   void ustalenia() 
   {
	 System.out.println("Wylosowano bramki. Wylosowano dru�yn� rozpoczynaj�c� mecz");
   }

   void rozpoczecieGry() 
   {
	 System.out.println("Gra rozpocz�ta! Pierwsze podanie pi�ki...");
   }
}
