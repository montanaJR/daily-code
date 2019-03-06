package org.montanajr.lab03.decorator;
public abstract class Napoj 
 {
	String opis = "nieznany napoj";
  
	public String getOpis() 
	{
	  return opis;
	}
 
	public abstract double koszt();
}
