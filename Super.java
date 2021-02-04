package oopsfeatures;

class A
{
	int a=10;
}
class B extends A
{
	int a=20;
	void addition()
	{
		int result=super.a + super.a;
		System.out.println("Result "+result);
	}
}
public class Super
{
	public static void main(String[] args)
	{
		B d=new B();
		d.addition();
	}
}
