package org.montanajr.lab09.zad03;

public class TaxiDriver extends Driver{

	public TaxiDriver(OperatorMediator mediator, Integer coords, String name) {
		super(mediator, coords, name);
	}

	@Override
	public void send(String name, Integer coords) {
		getMediator().sendMessage(name, coords);
		
	}

	@Override
	public void receive(Integer coords) {
		System.out.println(this.getName() + " ::Will be soon " );
		
	}
	
	

}
