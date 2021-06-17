package containment;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import containment.emp.Employee;
import containment.date.MyDate;


public class ContainmentMain {

	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		MyDate ob=new MyDate();
		ob.setDay(12);
		ob.setMonth(12);
		ob.setYear(2020);
		emp.setEmpId(1);
		emp.setName("vishal");
		emp.setBirthDate(ob);
		
		System.out.println("EmpID:-"+emp.getEmpId());
		System.out.println("Name:-"+emp.getName());
		System.out.println("Birthdate:-"+emp.getBirthDate());
		System.out.println(emp);
		//emp.display();
		
		Employee emp1=new Employee(2,"vishal",ob);
		emp1.display();

	}

}
