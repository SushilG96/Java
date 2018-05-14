class fibo
{
public static void main(String args[])
	{
	 int a,i,f=0,j=0;
	a=Integer.parseInt(args[0]);
	while(a!=0)
	{
	f=f+j;
	System.out.print(f);
	j++;
	a--;
	}	
	}
}
