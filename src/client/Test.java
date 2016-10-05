package client;

import impl.CircelAdapter;
import impl.EventEmitter;
import impl.Rangle;
import impl.TextCircle;
import inter.Circle;
import inter.EventService;
import inter.EventHandler;
import inter.Shape;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EventEmitter event = new EventEmitter();
//		
//		event.on("click", new EventHandler() {
//			
//			@Override
//			public void callback(EventService e) {
//
//				System.out.println("click...");
//				
//				e.trigger("mouseover");
//			}
//		});
//			
//		event.on("mouseover", new EventHandler() {
//			
//			@Override
//			public void callback(EventService EventService) {
//				
//				System.out.println("mouseover...");
//			}
//		});
//		
//		event.trigger("click");
//		//event.trigger("mouseover");
		
		Test t = new Test();
		
		Circle circle = new TextCircle();
		
		CircelAdapter adapter = new CircelAdapter(circle);
		
		t.regist(adapter).draw();
		
		
		
		
	}
	
	private Shape regist(Shape s){
		return s;
	}

}


