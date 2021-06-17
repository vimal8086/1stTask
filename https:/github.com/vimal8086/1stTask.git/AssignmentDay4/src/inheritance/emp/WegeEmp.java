package inheritance.emp;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
public class WegeEmp extends Employee
{
	private int noOfHours;
	private float ratePerHours;
	
	public WegeEmp()
	{
		noOfHours=8;
		ratePerHours=5000f;
		System.out.println("default Constructor Manager class");
	}
	public WegeEmp(int empId,String name,float salary,int Hours,float rate)
	{
		super(empId,name,salary);
		this.noOfHours=Hours;
		this.ratePerHours=rate;
		
		System.out.println(" WegeEmp class");
	} 
	
	public void calculateWege()
	{
		System.out.println("wage :-" +ratePerHours*noOfHours);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

