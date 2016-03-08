package com.estsoft.paint.app;

import com.estsoft.paint.i.Drawable;
import com.estsoft.paint.i.Resizable;
import com.estsoft.paint.point.ColorPoint;
import com.estsoft.paint.point.Point;
import com.estsoft.paint.shape.Circle;
import com.estsoft.paint.shape.Rectangle;
import com.estsoft.paint.shape.Shape;
import com.estsoft.paint.shape.Triangle;

public class MainApp {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX( 100 );
		point.setY( 50 );
		point.show();

		Point point2 = new Point( 200, 200 );
		point2.show();
		
		point.show( false );
		point2.show( false );
		point2.show( true );
		
		Point point3 = new ColorPoint();
		point3.setX( 500 );
		point3.setY( 500 );
		((ColorPoint)point3).setColor( "red" );
		
		point3.show();

		Point point4 = new ColorPoint(250, 250, "yellow");
		point4.show();
		
		//삼각형 그리기
		Shape shape1 = new Triangle();
		Triangle triangle = (Triangle)shape1;
		draw( triangle );
		
		//System.out.println( triangle instanceof Rectangle );
		//사각형 그리기
		//draw( new Rectangle() );
		
	}
	
	public static void resize( Drawable drawable ) {
		if( drawable instanceof Resizable ) {
			Resizable resizable = (Resizable)drawable;
			resizable.resize( 0.5 );
		}
	}
	
	public static void draw( Drawable drawable ) {

		// 객체가 Circle 클래스의 인스턴스 인가?
		System.out.println( drawable instanceof Circle );

		// 객체가 Drawable 인터페이스를 구현하였는가?
		System.out.println( drawable instanceof Drawable );

		// 객체가 Rectangle 클래스의 인스턴스 인가?
		System.out.println( drawable instanceof Rectangle );

		// 객체가 Triangle 클래스의 인스턴스 인가?
		System.out.println( drawable instanceof Triangle );

		// 객체가 Shape 클래스의 인스턴스 인가?
		System.out.println( drawable instanceof Shape ); 
		
		drawable.draw();
	}
	

}
