package inheritance.emp;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class Employee 
{
	private int empId;
	private String name;
	private double salary;
	
	public Employee()
	{
		empId=1;
		name="vishal";
		salary=20000;
	}
	public Employee(int empId,String name,double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		
	}
	
	protected void display()
	{
		System.out.println("Employee Detail:-"+empId+","+name+","+salary);
	}
	public String toString()
	{
		return  +empId+"/"+name+"/"+salary;
	}
	
}

