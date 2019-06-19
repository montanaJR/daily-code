package org.montanajr.lab09.zad03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OperatorMediatorImpl implements OperatorMediator {

	private Map<Integer, Driver> driversMap = new HashMap<>();

	@Override
	public void sendMessage(String user, Integer coordinates) {
		Driver d = driversMap.get(coordinates);
		Set<Integer> keys = driversMap.keySet();

		Integer[] array = keys.toArray(new Integer[keys.size()]);
		
		

		d.receive(findClosest(array, coordinates));

	}

	@Override
	public void addDriver(Driver driver) {
		this.driversMap.put(driver.getCoords(), driver);

	}

	public static int findClosest(Integer arr[], int target) {
		 int min = Integer.MAX_VALUE;
		    int closest = target;

		    for (int v : arr) {
		        final int diff = Math.abs(v - target);

		        if (diff < min) {
		            min = diff;
		            closest = v;
		        }
		    }

		    return closest;
	}

}
