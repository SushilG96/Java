import java.io.*;
class Sort
{
	void asorting(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
		 for(int j=i;j<a.length;j++)
		   {
			if(a[i]>a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		   }
		}

	}


	void dsorting(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
		 for(int j=i;j<a.length;j++)
		   {
			if(a[i]<a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		   }
		}

	}
	void display(int a[])
	{
		for(int k=0;k<a.length;k++)
		{
			System.out.println(" "+a[k]);
		}
	}
public static void main(String args[])throws IOException
 {
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the limit");
	int n=Integer.parseInt(b.readLine());
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	ar[i]=Integer.parseInt(b.readLine());
	Sort ob = new Sort();
	ob.asorting(ar);
	ob.display(ar);
	//ob.dsorting(ar);
	//ob.display(ar);
 }
}
