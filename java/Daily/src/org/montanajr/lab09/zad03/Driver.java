package org.montanajr.lab09.zad03;

public abstract class Driver {
	private OperatorMediator mediator;
	
	private Integer coords;
	private String name;
	public Driver(OperatorMediator mediator, Integer coords, String name) {
		super();
		this.mediator = mediator;
		this.coords = coords;
		this.name = name;
	}
	
	public abstract void send(String name, Integer coords);
    public abstract void receive(Integer coords);

	public OperatorMediator getMediator() {
		return mediator;
	}

	public Integer getCoords() {
		return coords;
	}

	public String getName() {
		return name;
	}
    
    
    
}
