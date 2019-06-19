package org.montanajr.lab10.zad02;

import java.util.Arrays;

public class Asc implements Strategy {

	@Override
	public String run(String input) {
		char tempArray[] = input.toCharArray(); 
        
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray);
	}

}
