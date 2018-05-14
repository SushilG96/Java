abstract class Plan
{
	double rate;
	abstract void getrate(double r);
	abstract void calbill();
}
class Commercial extends Plan
{
	double rate;
	double bill;
	void getrate(double r)
	{
		rate=r;	
	}
	void calbill()
	{
		bill=250*rate;
		System.out.println("The Bill is:"+bill);

	}
			
}
class Domestic extends Plan
{
	double rate;
	double bill;
	void getrate(double r)
	{
		rate=r;	
	}
	void calbill()
	{
		bill=250*rate;
		System.out.println("The Bill is:"+bill);
	}
}
class Electricbill
{
	public static void main(String args[])
	{
		Domestic ob = new Domestic();
		Commercial ob1= new Commercial();
		ob1.getrate(5);
		ob1.calbill();
		ob.getrate(2.5);
		ob.calbill();
	}
}
