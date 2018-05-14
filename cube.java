class cube
{
	public static void main(String args[])
	{
		int s=0,i;
		int a = Integer.parseInt(args[0]);
		for(i=1;i<=a;i++)
		{
		s=i*i*i;
		System.out.println("The Cube of the "+i+"is"+s); 
		}
	}

}
