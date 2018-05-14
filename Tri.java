import java.io.*;
class Tri
{
	int b,h,z;double s;
	Tri(int a, int b,int c)
	{
	b=a;
	h=b;
	z=c;
	}
	double cal(int i)	
	{	
		if (i==1)
		{		
		s=((b+h+z)/2.0);
		return(s*(s-b)*(s-h)*(s-z));
		}
		else
		{
			return(b*h*0.5);
		}
	}

	Tri(int a, int b)
	{
	b=a;
	h=b;
	}
	
public static void main(String args[])throws IOException
	
	{
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Breath");
	int bre=Integer.parseInt(b.readLine());
	System.out.println("Enter Height");
	int hei=Integer.parseInt(b.readLine());
	System.out.println("Enter Z");
	int ze=Integer.parseInt(b.readLine());
	System.out.println("Choice by which menthod 1.Standard 2.Normal");
	int k=Integer.parseInt(b.readLine());
	if(k==1)
	{
	Tri ob =new Tri(bre,hei,ze);
	System.out.println("Area is"+ob.cal(1));
	}
	else
	{
	Tri ob1 =new Tri(bre,hei);
	System.out.println("Area is"+ob1.cal(2));	}
	}	
}
