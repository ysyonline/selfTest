package respone.impl;

import respone.inter.IEvent;

public class Handler2 extends AbstractPorcessHandler {

	public Handler2(int state) {
		super(state);
	}

	@Override
	public void process( IEvent event ) {
		System.out.println("this is Handler 2 ... porcess....");
		System.out.println("state: " + event.getState() + "message: " + event.getMessage());
	}

}
