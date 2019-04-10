package org.montanajr.lab06.flyweight;

import java.util.HashMap;

public class FabrykaKsztaltow 
{
  private static final HashMap<TypyKsztaltow,Ksztalt> ksztalty = new HashMap<>();

	public static Ksztalt getKsztalt(TypyKsztaltow typ) 
	{
		Ksztalt ksztaltImpl = ksztalty.get(typ);

		if (ksztaltImpl == null) {
		  if (typ.equals(TypyKsztaltow.OVAL_FILL)){
				ksztaltImpl = new Owal(true);
			} 
		   else if (typ.equals(TypyKsztaltow.OVAL_NOFILL))  {
				ksztaltImpl = new Owal(false);
			} 
		   else if (typ.equals(TypyKsztaltow.LINE))  {
				ksztaltImpl = new Linia();
			}
			ksztalty.put(typ, ksztaltImpl);
		}
		return ksztaltImpl;
	}
	
	public enum TypyKsztaltow
	{
		OVAL_FILL,
		OVAL_NOFILL,
		LINE;
	}
}