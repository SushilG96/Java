class triangle
{
	double a(int a,int b)
	{
	 return (0.5*a*b);
	}
	public static void main(String args[])
	{
	triangle  ob=new triangle();
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	double area = ob.a(a,b);
	System.out.println(area);
	}
}
