package impl;

import inter.Circle;
import inter.Shape;

public class CircelAdapter implements Shape {

	private Circle circle;
	
	public CircelAdapter( Circle circle ){
		this.circle = circle;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		circle.drawDoubleCircle();
	}

}
