package respone.impl;

import respone.inter.IEvent;

public class Handler1 extends AbstractPorcessHandler {

	public Handler1(int state) {
		super(state);
	}

	@Override
	public void process( IEvent event ) throws InterruptedException {
		System.out.println("this is Handler 1 ... porcess....");
		
		for( int i = 0; i < 10; i ++ ){
			Thread.sleep(1000);
			System.out.print(".");
		}
		
		System.out.println("state: " + event.getState() + ",message: " + event.getMessage());
	}

}
