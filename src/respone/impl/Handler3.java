package respone.impl;

import respone.inter.IEvent;

public class Handler3 extends AbstractPorcessHandler {

	public Handler3(int state) {
		super(state);
	}

	@Override
	public void process( IEvent event ) throws InterruptedException {
		System.out.println("this is Handler 3 ... porcess....");
		for( int i = 0; i < 10; i ++ ){
			Thread.sleep(500);
			if( i % 5 == 0){
				System.out.print("\n");
			}
			System.out.print("."); 
			
		}
		System.out.println("state: " + event.getState() + "message: " + event.getMessage());
	}

}
