package inheritance.emp.mgr;

import inheritance.emp.Employee;

/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class Manager extends Employee
{
	private double incentives;
	//private int empId;
	
	public Manager()
	{
		incentives=5000f;
		System.out.println("Manager class");
	}
	public Manager(int empId,String name,double salary,double incentives)
	{
		
		super(empId,name,salary);
		this.incentives=incentives;
		System.out.println(" Manager class");
	}
	
	public void showIncentives()
	{
		
		System.out.println("Incentives:-"+incentives);
	}
	
	public void display()
	{
		super.display();
		System.out.println();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
