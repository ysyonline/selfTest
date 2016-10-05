package observer.impl;

import observer.inter.IObserver;
import observer.inter.ISubject;

public class StateCanbin implements IObserver {
	
	
	public StateCanbin( ISubject subject ){
		subject.regist(this);
	}
	
	@Override
	public void update(ISubject subject) {
		 display( subject);
	}
	
	public void display(ISubject subject){
		SubjectImpl subjectImpl = (SubjectImpl)subject;
		System.out.println("the state is: " + subjectImpl.getState() + "the message is: " + subjectImpl.getMessage());
	}

}
