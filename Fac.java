class Fac
{
	static int f;
	static int fac=1;
	static void fac(int fa)
	{
		f=fa;
		for(int i=1;i<=f;i++)
		{	
			fac=fac*i;
		}
		System.out.println("Factorial of "+f+"is ="+fac);
	
	}
	
	public static void main(String args[])
	{
		Fac.fac(Integer.parseInt(args[0]));
	}
	
}
