package respone.fade;

import java.util.ArrayList;
import java.util.List;

import respone.inter.IEvent;
import respone.inter.IHandler;

public class ProcessHandlerMachine {
	
	private final List<IHandler> handlers = new ArrayList<IHandler>();
	
	private static final ProcessHandlerMachine instance = new ProcessHandlerMachine();
	
	private ProcessHandlerMachine(){}
	
	public static ProcessHandlerMachine getInstance(){
		return instance;
	}
	
	public void bootstrop( IEvent event ){
		combineNode();
		this.handlers.get(0).requestHandler(event);
	}
	
	private void combineNode(){
		IHandler currentHandler = null;
		IHandler nextHandler = null;
		int len = handlers.size();
		for( int i = 0; i < len; i++ ){
			currentHandler = handlers.get(i);
			if( i != len - 1 ){
				nextHandler = handlers.get(i + 1 );
				currentHandler.setHandler(nextHandler);
			}
			else{
				return;
			}
		}
		
	}

	public ProcessHandlerMachine addHandler( IHandler handler ){
		this.handlers.add(handler);
		return this;
	}
}
