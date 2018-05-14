import java.io.*;
class Studenttest
{
	int roll,math,chemistry;
	void getroll(int r)
	{
		roll = r;
		
	}
	void getmarks(int m,int c)
	{
		math=m;
		chemistry=c;
	}
	void displayroll()
	{
		System.out.println("ROll Number is"+roll);
	}
	void displaymark()
	{
		System.out.println("Maths"+math+"\n"+"Chemistry"+chemistry);
	}

}	
interface sports
{
	int sportwt=5;
	void displaywt();
}
class Result extends Studenttest implements sports
{	
	public void displaywt()
	{
		System.out.println("Sports Weight"+sportwt);
	}
	void displayresult()
	{	
		int total = math+chemistry+sportwt;
		System.out.println("Total marks"+ total);		
	}
}
class D7_test extends Result
{
	public static void main(String args[])throws IOException
	 {
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Roll");
	int r=Integer.parseInt(b.readLine());
	System.out.println("Enter Chemistry Marks");
	int c=Integer.parseInt(b.readLine());
	System.out.println("Enter Maths Marks");
	int m=Integer.parseInt(b.readLine());
	System.out.println("Enter SportsWt");
	int s=Integer.parseInt(b.readLine());
	//Studenttest ob =new Studenttest();
	Result ob = new Result();
	ob.getroll(r);
	ob.getmarks(m,c);
	ob.displayroll();
	ob.displaymark();
	ob.displaywt();
	ob.displayresult(); 		
	}
}

