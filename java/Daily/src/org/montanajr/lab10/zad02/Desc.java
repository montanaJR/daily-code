package org.montanajr.lab10.zad02;

import java.util.Arrays;

public class Desc implements Strategy {
	
	

	@Override
	public String run(String input) {
		char[] arr = input.toCharArray();
		String result = "";

		for(int i = 0; i < arr.length; i++) System.out.print(arr[i]);
		System.out.println();

		Arrays.sort(arr); // sorted in ascending order

		for(int i = arr.length - 1; i >= 0; i--) result = result + arr[i];
		return result;
	}

}
