package org.montanajr.lab09.zad03;

public class Demo {

	public static void main(String[] args) {
		OperatorMediator om = new OperatorMediatorImpl();
		
		Driver t1 = new TaxiDriver(om, 50, "Alex");
		Driver t2 = new TaxiDriver(om, 33, "Mike");
		Driver t3 = new TaxiDriver(om, 66, "Collum");
		Driver t4 = new TaxiDriver(om, 22, "Annie");
		
		om.addDriver(t1);
		om.addDriver(t2);
		om.addDriver(t3);
		om.addDriver(t4);
		
		t1.send("Passenger1", 33);
		t1.send("Passenger3", 66);
		
		
		

	}

}
