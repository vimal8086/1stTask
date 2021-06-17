package com.phoenix.shapes.main;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstarctMain {

	public static void main(String[] args) 
	{
		 Shape ob;
		
		 ob=new Circle(12f);
		 ob.calculateArea();
		 ob.calculatePerimeter();
		 //System.out.println();
		 
		 ob =new Rectangle(12,12);
		 ob.calculateArea();
		 ob.calculatePerimeter();
		 System.out.println();
		
		 ob =new Square(12); 
		 ob.calculateArea(); 
		 ob.calculatePerimeter();
		 System.out.println();
		  
		 
		 

	}

}

