package mypack;

public class Customer {

	private int customerId;
	private String name;
	private int age;
    private String city;
    private int pinCode;
    public Customer() 
    {
        System.out.println("Default Constructor called");
    }
    public Customer(int customerId,String name,int age,String city,int pinCode)
    {
        this.customerId = customerId;
        this.name=name;
        this.age=age;
        this.city=city;
        this.pinCode=pinCode;
    }
    
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() 
	{
			return "Customer [customerId=" + customerId + "] [name=" + name + "] [city=" + city + "] [age=" + age + "] [pinCode=" + pinCode + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public void printDetail()
	{
		System.out.println("Customer [customerId=" + customerId + "] [name=" + name + "] [city=" + city + "] [age=" + age + "] [pinCode=" + pinCode + "]");
	}
	
	
	
	
	
	
  
}
