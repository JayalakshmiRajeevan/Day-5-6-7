package day6OOPS;
class Car
{
	static String model;
	static String brand;
	static int SeatCapacity;
	static String Engine;
	Car(String brand, String model, int SeatCapacity, String Engine)
	{
		this.model=model;
		this.brand=brand;
		this.SeatCapacity=SeatCapacity;
		this.Engine=Engine;
	}
	String SeatCapacity()
	{
		if(SeatCapacity<9)
			return "Car";
		else
			return "Mini Bus";
	}
	void display()
	{
		System.out.println("Model: "+model);
		System.out.println("Brand :"+brand);
		System.out.println("SeatCapacity: "+SeatCapacity);
		System.out.println("Engine: "+Engine);
	}
	public static void main(String[] args) 
	{
		Car c2=new Car("City","Honda",4,"Diesel");
		c2.display();
		System.out.println(c2.SeatCapacity());
	}

}
