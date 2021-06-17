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

public class InheritanceMain
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.toString();
		
		Manager m1=new Manager();
		m1.showIncentives();
		m1.display();
		
		Manager m2=new Manager();
		m2.showIncentives();
		m2.display();
		m2.toString();
		
		WegeEmp w1=new WegeEmp();
		w1.calculateWege();
		w1.display();
		w1.toString();
		
		
	}
}
