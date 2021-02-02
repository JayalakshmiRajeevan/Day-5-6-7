package day6OOPS;

class OopsBasic 
{
	int id;
	String name;
	double salary;
	int experience;
	void displayEmpDetails()
	{
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Experience "+experience);
	}
	String checkForLoan()
	{
		if(salary>75000.0)
			return "you can apply for loan";
		return "you cannot apply";
	}
	public static void main(String[] args)
	{
		OopsBasic emp=new OopsBasic();
		emp.id=1;
		emp.name="jayalakshmi";
		emp.salary=60000;
		emp.experience=4;
		emp.displayEmpDetails();
		System.out.println(emp.checkForLoan());
	}
}
