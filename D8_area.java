import java.io.*;
interface area
{
	double compute(double x,double y);
	double pi=3.16;
}
interface display
{
	void show(double r);
}
class rectange implements area,display
{
	double t;
	public double compute(double x,double y)
	{
		t=x*y;
		return (t);
	}
	public void show(double r)
	{
		System.out.println("Area of Rectangle is"+t);
	}
}
class circle implements area,display
{	double t;
	public double compute(double x,double y)
	{
		//double t;
		t=pi*x*x;
		return(t);
		
	}
	public void show(double r)
	{
		System.out.println("Area of Circle is"+t);
	}
}
class D8_area 
{
	public static void main(String args[])throws IOException
	 {
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter WIdth");
	double x=Double.parseDouble(b.readLine());
	System.out.println("Enter Height");
	double y=Double.parseDouble(b.readLine());
	System.out.println("Enter Radius");
	double r=Double.parseDouble(b.readLine());
	 circle ob = new circle();
	 rectange ob1 = new rectange();
	 ob.compute(x,y);
	 ob.show(x);
	 ob1.compute(x,y);
	 ob1.show(x);
	}
}
