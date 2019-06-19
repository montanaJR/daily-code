package org.montanajr.lab09.observer;

import java.util.*;
import java.util.Map.Entry;

public class ObserwatorKonfiguracji extends Obserwator 
{

	private HashMap<String, String> konfiguracja;
	
	public ObserwatorKonfiguracji() 
	{
		this.konfiguracja = new HashMap<String, String>();
	}
	
	@SuppressWarnings("unchecked")
	public void aktualizuj(Object arg) 
	{
		if(arg instanceof HashMap<?,?>)
		{
			Iterator i = ((HashMap) arg).entrySet().iterator();
			while(i.hasNext())
			{
				Entry<String, String> para = (Entry<String, String>) i.next();
				
				if(this.konfiguracja.containsKey(para.getKey()))
					this.konfiguracja.replace(para.getKey(), para.getValue());
				else
					this.konfiguracja.put(para.getKey(), para.getValue());
				
			}
			
			i = this.konfiguracja.entrySet().iterator();
			
			while(i.hasNext())
			{
				Entry<String, String> para = (Entry<String, String>) i.next();
				System.out.println(para.getKey() + ": " + para.getValue());
			}
		}
	}

}
