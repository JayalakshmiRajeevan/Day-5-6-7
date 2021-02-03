package oopsfeatures;

class Parent
{
	void display1()
	{
		System.out.println("This is parent class");
	}
}
class Child extends Parent
{
	void display2()
	{
		System.out.println("This is child class");
	}
}
public	class Inheritance
{
public static  void main(String[] args) 
	{
		Child c= new Child();
		c.display1();
		c.display2();
	}
}
