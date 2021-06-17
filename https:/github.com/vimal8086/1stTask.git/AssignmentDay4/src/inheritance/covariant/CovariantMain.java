package inheritance.covariant;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.WegeEmp;
import inheritance.emp.mgr.Manager;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		EmployeeData emp=new EmployeeData();
		Employee e=emp.getEmployee();
		
		ManagerData m1=new ManagerData();
		Manager m=m1.getEmployee();
		
		WageEmpData w1=new WageEmpData();
		WegeEmp w=w1.getEmployee();
		
		
				

	}

}

