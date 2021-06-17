package inheritance;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import inheritance.emp.Employee;
import inheritance.emp.WegeEmp;
import inheritance.emp.mgr.Manager;

public class RTTIMain
{
	public static void showEmpInfo(Employee emp)
	{
		
		if(emp instanceof Manager)
		{
			System.out.println("Manager Type");
			((Manager)emp).showIncentives();
			((Manager)emp).display();
			emp.toString();
			
		}
		if(emp instanceof WegeEmp)
		{
			System.out.println("Wege Emp Type");
			WegeEmp we=(WegeEmp)emp;
			we.calculateWege();
			we.display();
		}
	}
	public static void main(String[] args) 
	{
		
		Employee m=new Manager(1,"sagar",2000.0,121212);
		showEmpInfo(m);
		System.out.println("*******************************");
		
		Employee w=new WegeEmp(1,"vishal",2000,12,21);
		showEmpInfo(w);
		System.out.println("");
	}
}
