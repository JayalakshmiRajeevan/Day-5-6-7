package day6OOPS;

class Constructor
{
	int id;
	int price;
	String name;
	Constructor()
	{
		System.out.println("Default Constructor");
		id=1;
		price=250;
	}
	void display()
	{
		System.out.println("Id: "+id);
		System.out.println("Price: "+price);
		System.out.println("Name: "+name);
	}
	public static void main(String[] args)
	{
		Constructor P=new Constructor();
		P.display();
	}

}
