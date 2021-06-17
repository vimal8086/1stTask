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

public class InheritanceDTMain {

	public static void main(String[] args)
	{
		Employee ob;
		ob=new Manager();
		((Manager)ob).display();
		((Manager)ob).showIncentives();
		
		ob=new WegeEmp();
		((WegeEmp)ob).display();
		((WegeEmp)ob).calculateWege();
		

	}

}