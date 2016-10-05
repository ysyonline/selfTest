package observer.inter;

public interface ISubject {
	void regist( IObserver observer );
	void remove( IObserver observer );
	void notifyObservers();
}
