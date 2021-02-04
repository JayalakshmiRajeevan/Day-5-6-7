package oopsfeatures;

class P
{
	static void m1()
	{
		System.out.println("Parent static method");
	}
	void m2()
	{
		System.out.println("parent non static method");
	}
}
class Q extends P
{
	static void m1()
	{
		System.out.println("child static class");
	}
	void m2()
	{
		System.out.println("child non static class");
	}
}
public class OverridingStatic 
{
	public static void main(String[] args) 
	{
		P p1=new Q();
		p1.m1();
		p1.m2();
	}

}
