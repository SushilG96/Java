import java.io.*;
class Namesort
{
	 public void sorting(String a[])
	  {
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
		 for(int j=i;j<a.length;j++)
		   {	int p=a[i].CharAt(0);
			int q=a[j].charAt(0);
			if(p<q)
			{
			temp=p;
			p=q;
			q=temp;
			}
		   }
		}
				
	}
public static void main(String args[])throws IOException
  {
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
	String a[]=new String[100];int i;	
	
	System.out.println("Enter number of elements ::");
	int n =Integer.parseInt(b.readLine());
	System.out.println("Enter Strings ::");	
	for(int c=0;c<n;c++)
	{
		a[c]=b.readLine();	
	}
	Namesort ob =new Namesort();
	//ob.sorting(a);
	ob.sorting(a);
	for(int c=0;c<n;c++)
	{
		System.out.println(a[c]);	
	}
	
  }
}
