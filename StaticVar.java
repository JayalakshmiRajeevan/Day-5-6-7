package day6OOPS;
public class StaticVar
{
	int Id;
	String Name;
	static String Company="Fujitsu";
	void display()
	{
		System.out.println("Id: "+Id);
		System.out.println("Name: "+Name);
		System.out.println("Company: "+Company);
	}
	public static void main(String[] args)
	{
		StaticVar s1=new StaticVar();
		s1.Id=1;
		s1.Name="Anu";
		StaticVar s2=new StaticVar();
		s2.Id=2;
		s2.Name="Lakshmi";
		StaticVar s3=new StaticVar();
		s3.Id=3;
		s3.Name="Vani";
		s1.display();
		s2.display();
		s3.display();
	}
}
