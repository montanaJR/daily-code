package org.montanajr.lab05.proxy;

public class Program 
{
	
	public static void main(String[] args) 
	{
	   Obraz obraz = new ObiektProxy("image_8mb.jpg");

       obraz.wyswietl();
  	   System.out.println("");
	   obraz.wyswietl();
	}
 }