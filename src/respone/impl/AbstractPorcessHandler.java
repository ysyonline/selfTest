package respone.impl;

import respone.inter.IEvent;
import respone.inter.IHandler;

public abstract class AbstractPorcessHandler implements IHandler {

	private IHandler handler;
	
	private int state = -1;
	
	/**
	 * 
	 * @param state 0,1,2
	 */
	public AbstractPorcessHandler( int state ){
		this.state = state;
	}
	
	@Override
	public final void requestHandler(IEvent event) {
//		if( event != null ){
//			if( event.getState() == this.state ){
//				this.process( event );
//			}
//			else{
//				if( this.handler != null ){
//					System.out.println("sorry, I can not do it...");
//					this.handler.requestHandler(event);
//				}
//			}
//		}
		
		if( event == null ){
			return;
		}
		if( event.getState() == this.state ){
			
			System.out.println( this.getClass()+" ========== begin to process the event ===========" );
			try {
				this.process( event );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println( this.getClass()+" ========== end to process the event =============" );
			return;
		}
		if( this.handler != null ){
			System.out.print( this.getClass()+" >>>>>>>> catch the event >>>>>>>" );
			System.out.println("sorry, I can not do it...");
			this.handler.requestHandler(event);
			return;
		}
	}
	
	@Override
	public void setHandler(IHandler handler) {
		this.handler = handler;
	}

	public abstract void process ( IEvent event ) throws InterruptedException;
}
