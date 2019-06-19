package org.montanajr.lab07.interpreter;

import java.util.Map;

public class Number implements Expression {
	
   private int number;
   public Number(int number)       
	 { 
	 	this.number = number; 
	 }
	
   public int interpret(Map<String,Expression> variables)  
   { 
	 return number; 
   }
 }


