import java.io.*;
class  Employee 
{
	String name;
	String address;	
	void detail(String n,String a)
	{
		name=n;
		address=a;
	}
	void display()
	{	
		System.out.println("Name is"+name);
		System.out.println("Address is"+address);
	}
}
class Scientist extends Employee
{	
	String publication;
	int project;
	String type;
	void detail(String s,String a,String pub,int pro,String ty)
	{
		
		super.detail(s,a);
		publication=pub;
		project=pro;
		type=ty;	
	}
	void display()
	{	
		super.display();
		System.out.println("Scientist subject of Publication is"+publication);
		System.out.println("Scientist No. of project is"+project);
		System.out.println("Scientist Type of is"+type);
	}
}
class Engineer extends Employee
{	
	int salary;
	String type;
	void detail(String s,String a,int s,String ty)
	{
		super.detail(s,a);
		salary=s;
		type=ty;	
	}
	void display()
	{	
		super.display();
		System.out.println("Salary is"+salary);
		System.out.println("Type is"+type);
	}
}
class Worker extends Employee
{	
	//int salary;
	String type;
	void detail(String ty)
	{
		super.detail(s,a);
		type=ty;	
	}
	void display()
	{	
		super.display();
		System.out.println("Type is"+type);
	}
}
class Regular extends Worker
{	
	super.detail(s,a);
	int salary;
	void detail(String s,String a,int s,String ty)
	{
		salary=s;	
	}
	void display()
	{	
		System.out.println("Salary is"+ salary);
	}
}
class Daily extends Worker
{	
	int salary;
	void detail(String s,String a,int s,String ty)
	{
		salary=s;	
	}
	void display()
	{	
		System.out.println("Salary is"+ salary);
	}

}
class Database
{
	public static void main(String args[])throws IOException
	 {
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Name");
	String n=b.readLine();
	System.out.println("Enter Address");
	String a=b.readLine();
	System.out.println("Enter Pub");
	String pub=b.readLine();
	System.out.println("Enter Pro");
	int p=Integer.parseInt(b.readLine());
	System.out.println("Enter type");
	String type=b.readLine();	
	System.out.println("Enter Salary");
	int sal=Integer.parseInt(b.readLine());
		Scientist ob = new Scientist();
		Engineer.ob1 =new Engineer();
		ob.detail(n,a,pub,p,type);
		ob.display();
		ob1.detail(n,a,sal,type);
		ob1.display();
	}
}
