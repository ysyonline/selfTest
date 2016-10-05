package respone;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import respone.fade.ProcessHandlerMachine;
import respone.impl.Event;
import respone.impl.Handler1;
import respone.impl.Handler2;
import respone.impl.Handler3;
import respone.inter.IEvent;
import respone.inter.IHandler;

public class ResponseTest {
	public static void main(String[] args) {
		
		ProcessHandlerMachine phm = ProcessHandlerMachine.getInstance();
		
		
		phm.addHandler(new Handler1(1))
		   .addHandler(new Handler2(2))
		   .addHandler(new Handler3(3));
		
		IEvent event = new Event(3, "this div is on the 3 layout");
		
		phm.bootstrop(event);
		
		InvocationHandler IhandlerImpl = new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				System.out.println(method.getName());
				return null;
			}
			
		};
		
		
		IHandler hander = (IHandler)Proxy.newProxyInstance(IHandler.class.getClassLoader(),
				new Class[]{ IHandler.class}, new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						// TODO Auto-generated method stub
						return null;
					}
				});
		
		hander.requestHandler( event );
		
	}
}

