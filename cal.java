class cal
{
	public static void main(String args[])
	{
	int s=0;
	int a=Integer.parseInt(args[0]);
	char c  = args[1].charAt(0);
//	String c=args[1];
	int b=Integer.parseInt(args[2]);
	
	if (c=='*')
		{
		s=a*b;	
		}
	else if(c=='/')
		{
		s=a/b;
		}
	else if(c=='+')
		{
		s=a+b;
		}
	else
		{
		s=a-b;
		}
	System.out.println("Value is"+a+c+b+"="+ s);
	
	}
}
