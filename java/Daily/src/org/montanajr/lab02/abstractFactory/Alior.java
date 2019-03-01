package org.montanajr.lab02.abstractFactory;

public class Alior implements Bank
{

  private final String bname;

  public Alior()
   {
    bname="Alior Bank";
   }


  public String getBankName()
    {
      return bname;
    }

}
