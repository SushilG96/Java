import java.io.*;
class Name
{
public static void main(String args[])throws IOException
  {
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter First ::");
	String f=b.readLine();
	StringBuffer ob = new StringBuffer(f);

	System.out.println ("Enter Last ::");
	String l=b.readLine();
	StringBuffer ob1 = new StringBuffer(m);

	System.out.println("Full name:: "+f+l);

	System.out.println("Enter Middile name ");
	String m=b.readLine();
	StringBuffer ob1 = new StringBuffer(m);

	String f= ob.indexof(" ");
	System.out.println("Full name is"+ob.Replace(" ",ob1));

  }
}
