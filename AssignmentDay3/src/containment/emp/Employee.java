package containment.emp;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import containment.date.MyDate;

public class Employee
{
	private int empId;
	private String name;
	private MyDate birthDate;
	//private MyDate MyDate;
	
	public Employee()
	{
		System.out.println("Default Constructor");
	}
	public Employee(int empId,String name, MyDate birthDate)
	{
		this.empId=empId;
		this.name=name;
		this.birthDate=birthDate;
	}
	public void display()
	{
		System.out.println("Date is:-" +empId+"/"+name+"/"+birthDate);
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return  +empId+"/"+empId+"/"+birthDate;
	}
	
	
	
	/*
	 * public void printDate() { System.out.println("Date is:-"
	 * +day+"/"+month+"/"+year); }
	 */
}
