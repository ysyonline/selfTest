package respone.inter;

public interface IHandler {
	void requestHandler( IEvent event );
	
	void setHandler( IHandler handler );
}
