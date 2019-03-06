package org.montanajr.lab03.prototype;
import java.util.*;

public class Pracownik implements Cloneable{

	private List<String> pracownicyLista;
	
	protected Pracownik()
	{
		pracownicyLista = new ArrayList<String>();
	}
	
	protected Pracownik(List<String> list)
	{
		this.pracownicyLista=list;
	}
	
	protected void utworzListe()
	{
		pracownicyLista.add("Piotr");
		pracownicyLista.add("Marek");
		pracownicyLista.add("Ewa");
		pracownicyLista.add("Anna");
	}
	
	protected List<String> getPracList() 
	{
		return pracownicyLista;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException
	{
	 List<String> temp = new ArrayList<String>();
	   for(String s : this.getPracList()){
			temp.add(s);
	   }
	   return new Pracownik(temp);
	}
}