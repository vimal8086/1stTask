package com.phoenix.shapes.circles;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import com.phoenix.shapes.Shape;

public class Circle extends Shape 
{

	private float radius;
	
	public Circle()
	{
		radius=2f;
	}
	
	public Circle(float radius)
	{
		super();
		this.radius=radius;
	}
	
	
	
	  @Override
	  public void calculateArea() 
	  { 
		  double area=2*MATH_PI*radius;
		  System.out.println("Area of Circle" +area);
	  }
	  
	  @Override public void calculatePerimeter()
	  { 
		 double perimeter=MATH_PI*radius;
		  System.out.println("Area of Perimeter " +perimeter);
	  
	  }
	 

}
