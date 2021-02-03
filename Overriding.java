package oopsfeatures;

class Rbi
{
	void Interest()
	{
		System.out.println("The rate of interest is 4%");
	}
	void MinBalance()
	{
		System.out.println("The min balace should be 5000");
	}
}
class Sbi extends Rbi
{
	void Interest()
	{
		System.out.println("The rate of interest is 8%");
	}
	void MinBalance()
	{
		System.out.println("The min balace should be 5000");
	}
}
class Icici extends Rbi
{
	void Interest()
	{
		System.out.println("The rate of interest is 5%");
	}
	void MinBalance()
	{
		System.out.println("The min balace should be 10000");
	}
}
public class Overriding 
{
	public static void main(String[] args) 
	{
		Rbi Sbi=new Sbi();
		Sbi.Interest();
		Sbi.MinBalance();
		Rbi Icici=new Icici();
		Icici.MinBalance();
	}
}
