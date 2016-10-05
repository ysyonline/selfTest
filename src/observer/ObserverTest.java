package observer;

import observer.impl.StateCanbin;
import observer.impl.SubjectImpl;
import observer.inter.IObserver;
import observer.inter.ISubject;

public class ObserverTest {
	public static void main(String[] args) {
		ISubject wethdata = new SubjectImpl(78);
		
		StateCanbin ob = new StateCanbin(wethdata);
		
//		ob.display();
	}
}
