package day6OOPS;

public class Employee 
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args)
	{
		
		Employee emp1=new Employee(1,"sachin");
		System.out.println(emp1);
		System.out.println(emp1.hashCode());
	}
}
