package respone.impl;

import respone.inter.IEvent;

public class Event implements IEvent {

	private int state;
	
	private final String message;
	
	public Event( int state, String message ){
		this.state = state;
		this.message = message;
	}
	
	@Override
	public int getState() {
		return this.state;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
