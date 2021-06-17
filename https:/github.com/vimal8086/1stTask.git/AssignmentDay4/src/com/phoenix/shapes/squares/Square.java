package com.phoenix.shapes.squares;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import com.phoenix.shapes.Shape;

public class Square extends Shape
{
	private int side;
	
	public Square()
	{
		side=12;
		System.out.println();
	}
	
	public Square(int side)
	{
		this.side=side;
	}
	
	public  void calculateArea()
	{
		double area=+side*side;
		  System.out.println("Area of side:-" +area);
		System.out.println();
	}
	
	public void calculatePerimeter()
	{
		 double perimeter=side*side;
		  System.out.println("Area Of Perimeter:-" +perimeter);
	  
	}
	
	
	
}
