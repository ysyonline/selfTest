package observer.impl;

import java.util.ArrayList;
import java.util.List;

import observer.inter.IObserver;
import observer.inter.ISubject;

public class SubjectImpl implements ISubject {

	private final List<IObserver> observers = new ArrayList<IObserver>();
	
	private int state;
	
	private String message;
	
	public SubjectImpl(int state ){
		this.state = state;
	}
	
	@Override
	public void regist(IObserver observer) {
		if( observer == null ){
			return;
		}
		this.observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		int index = observers.indexOf(observer);
		if( index != -1 ){
			this.observers.remove(index);
		}
	}

	public void changeState(){
		if( this.state > 0 && this.state <= 10 ){
			this.message = "minjor level";
		}
		else if( this.state > 10 && this.state <= 20 ){
			this.message = "advacne level";
		}
		else{
			this.message = "marjor level";
		}
		this.notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for( IObserver observer : observers ){
			observer.update(this);
		}
	}

	public String getMessage() {
		return message;
	}

	public int getState() {
		return state;
	}

	
}
