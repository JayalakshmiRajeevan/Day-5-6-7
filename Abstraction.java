package oopsfeatures;

abstract class Bank
{
	abstract void rateofinterest();
	abstract void balance();
	void display()
	{
		System.out.println("alternative saturday off");
	}
}
 class Axis extends Bank
 {
	@Override
	void rateofinterest()
	{
		System.out.println("5%");
		
		
	}
	@Override
	void balance() 
	{
		System.out.println("5000");
	}
 }
 class Kotak extends Bank
 {
	 @Override
	 void rateofinterest() 
	 {
		 System.out.println("8%");
	 }

	 @Override
	 void balance() 
	 {
	 	System.out.println("10000");
	 }
 }

public class Abstraction
{
	public static void main(String[] args) 
	{
		Bank b=new Axis();
		b.display();
		b.balance();
	}
}

