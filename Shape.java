class Shape
{
	
void calvolume(double r)
	{
		System.out.println("The volume of Sphere is"+ (4/3*3.14*r*r*r));
	}

void calvolume(double r,double h)
	{
		System.out.println("The volume of Cone is"+ (1/3*3.14*r*r*h));
	}
void calvolume(double l,double b,double h)
	{
		System.out.println("The volume of box is"+ (l*b*h));
	}
public static void main(String args[])
{
	double r=Double.parseDouble(args[0]);
	double h=Double.parseDouble(args[1]);
	double l=Double.parseDouble(args[2]);
	double b=Double.parseDouble(args[3]);
	Shape ob = new Shape();
	ob.calvolume(r);
	ob.calvolume(r,h);
	ob.calvolume(l,b,h);
	
}

}


