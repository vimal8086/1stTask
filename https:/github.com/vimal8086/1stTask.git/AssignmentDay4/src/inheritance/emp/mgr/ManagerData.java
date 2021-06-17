package inheritance.emp.mgr;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData 
{
	public Manager getEmployee()
	{
		return new Manager();
	}
}
