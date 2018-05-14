class Empl
{
String name;
int age;
String gender;
int salary;		
void input(String s,int a,String gen,int sa)
	{
		name=s;
		age=a;
		gender=gen;
		salary=sa;
		
	}
void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Salary:"+salary);
		
	}
public static void main(String args[])
{	

	Empl ob1 = new Empl();
	String sa=args[0];
	int ag=Integer.parseInt(args[1]);
	String ge=args[2];
	int s=Integer.parseInt(args[3]);
	ob1.input(sa,ag,ge,s);
	ob1.display();
}
}
