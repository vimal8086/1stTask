package mypack;

public class CustomerMain {

	public static void main(String[] args) 
	{
		Customer obj=new Customer();
		obj.setName("Pravin");
		System.out.println(obj.getName());
		Customer obj1=new Customer(1,"vimal",22,"jamnagar",361012);
		obj1.printDetail();



	}
}
