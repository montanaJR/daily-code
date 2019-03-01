package org.montanajr.lab02.abstractFactory;

public abstract class Kredyt
{
  protected double stopa;

  abstract void getStopa(double stopa);

  public void oblicz_rate(double kwota, int ile_lat)
   {                  
      double rata;
      int n;
      n=ile_lat*12;
      stopa=stopa/1200;

      rata=((stopa*Math.pow((1+stopa),n))/((Math.pow((1+stopa),n))-1))*kwota;
      System.out.println("Twoja miesi�czna sp�ata wynosi "+rata+" z�, dla po�yczki=  " + kwota);
      

   }

}
