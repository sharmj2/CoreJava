package oops;

public class Employee {

	public String name;
	public int empId;
	public String department;
	public Employee() {
		
	}
	public Employee(String p1,int p2, String p3)
	{
		name = p1;
		empId = p2;
		department = p3;
	}
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(empId);
		System.out.println(department);
	}
}
