package inheritance.emp.wage;
/*
 *Author:-vimal.makwana@stltech.in
 *Creation date:- 09/06/2021
 *Version :-1.8
 *CopyRight:-Vimal Makwana
  */
import inheritance.emp.EmployeeData;
import inheritance.emp.WegeEmp;
//import inheritance.emp.mgr.Manager;

public class WageEmpData extends EmployeeData
{
	public WegeEmp getEmployee()
	{
		return new WegeEmp();
	}
}
