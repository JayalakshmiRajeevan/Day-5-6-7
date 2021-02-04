package oopsfeatures;

class Main
{
	void display1()
	{
		System.out.println("This is parent class");
	}
}
class Sub extends Main
{
	void display2()
	{
		System.out.println("This is child class");
	}
}
class Small extends Sub
{
	void display3()
	{
		System.out.println("This is sub child class");
	}
}
public class MLInheritance
{
	public static void main(String[] args)
	{
		Sub c= new Sub();
		c.display1();
		c.display2();
		Small d=new Small();
		d.display1();
		d.display2();
		d.display3();

	}
}
