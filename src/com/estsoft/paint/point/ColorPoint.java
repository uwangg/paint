package com.estsoft.paint.point;

import com.estsoft.paint.i.Drawable;

public class ColorPoint extends Point implements Drawable{

	private String color;
	
	public ColorPoint() {
	}
	
	public ColorPoint( String color ) {
		this.color = color;
	}
	public ColorPoint( int x, int y, String color ) {
//		setX(x);
//		setY(y);
		super( x, y );
		this.color = color;
		//this( color );
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public void show() {
		System.out.println( 
			"점 [x=" + getX() + 
			",y=" + getY() + 
			",color=" + color + 
			"]을 그렸습니다.");

	}

	@Override
	public void draw() {
		show();
	}
	
}
