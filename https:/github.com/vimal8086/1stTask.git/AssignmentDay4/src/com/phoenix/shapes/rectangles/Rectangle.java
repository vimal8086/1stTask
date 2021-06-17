package com.phoenix.shapes.rectangles;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import com.phoenix.shapes.Shape;

public class Rectangle extends Shape
{
	private int length;
	private int breadth;
	
	public Rectangle()
	{
		length=30;
		breadth=20;
	}
	
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public  void calculateArea()
	{
		double area=length*breadth;
		  System.out.println("Area of Rectangleis"+area);
		System.out.println();
	}
	
	public void calculatePerimeter()
	{
			double perimeter=length*breadth;
		  System.out.println("Area of perimeter"+perimeter);
	  
	}
	
}