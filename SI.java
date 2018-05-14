import java.io.*;
class SI
{
	int pri;
	int rate;
	int year;
	double interest;
void interest(int p,int r,int y)
	{
	pri=p;
	rate=r;
	year=y;
	interest=(pri*rate*year)/100;
	}
void display()
	{
	System.out.println("Interest is"+interest);
	
	}
public static void main(String args[])throws IOException
	{
	SI ob = new SI();
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Principle");	
	int p=Integer.parseInt(b.readLine());
	System.out.println("Enter Rate");
	int r=Integer.parseInt(b.readLine());
	System.out.println("Enter year");
	int t=Integer.parseInt(b.readLine());
	ob.interest(p,r,t);
	ob.display();
	
	}
}
