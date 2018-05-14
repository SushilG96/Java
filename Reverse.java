import java.io.*;
//import java.lang packages;
class Reverse
{
public static void main(String args[])throws IOException
  {
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
	String c=b.readLine();
	StringBuffer ob = new StringBuffer(c);
	System.out.println("String is ::"+c);
	String c2=ob.reverse().toString();
	if(c.equals(c2))
	{
	System.out.println("String is pallindrome");
	}
	else
	System.out.println("String is not pallindrome");
  }
}
