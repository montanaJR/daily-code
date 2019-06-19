package org.montanajr.lab12.state;

public class Program 
{
	public static void main(String[] args) 
	{
		KontekstStanu kontekst = new KontekstStanu();
		kontekst.dzwon();
		kontekst.dzwon();
		kontekst.ustawStan(new Niewyciszony());
		kontekst.dzwon();
		kontekst.dzwon();
		kontekst.dzwon();		
	}
}
