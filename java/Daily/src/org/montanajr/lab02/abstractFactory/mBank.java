package org.montanajr.lab02.abstractFactory;

public class mBank implements Bank
{
   private final String BNAME;
   public mBank()
   {
      BNAME="mBank";
    }

   public String getBankName()
    {
      return BNAME;
        
    }

}