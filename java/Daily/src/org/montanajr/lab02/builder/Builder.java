package org.montanajr.lab02.builder;


/**
 * Budowniczy mowi, ze jako klasa abstrakcyjna (interfejs, jezeli bez getPlan)
 * Builder dziecdziczy po tej klasie konkretny, ale
 * jezeli wygenerowany zostanie tego typu produkt, to nalezy
 * implementowac absttract zapewnic
 */
public abstract class Builder 
{
  protected Plan plan; // protected - do dziedziczenia
  
  public void newPlan()
  {
	  plan = new Plan();
  }
  
  public Plan getPlan()
  {
	 return plan; 
  }
  
  public abstract void proponujPrzedmiot1();
  public abstract void proponujPrzedmiot2();
  public abstract void proponujPrzedmiot3();
}
