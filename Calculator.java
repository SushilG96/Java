import java.io.*;
class Calculator
{
void add(int a[][],int b[][],int c[][])
   {
	for(int i=0;i<a.length;i++)
	  for(int j=0;j<a.length;j++)
	     c[i][j]=a[i][j]+b[i][j];	
   }
void sub(int a[][],int b[][],int c[][])
   {
	for(int i=0;i<a.length;i++)
	  for(int j=0;j<a.length;j++)
	     c[i][j]=a[i][j]-b[i][j];	
   }
void mul(int a[][],int b[][],int c[][])
   {
	for(int i=0;i<a.length;i++)
	  for(int j=0;j<a.length;j++)
	   for(int k=0;k<a.length;k++)
	     c[i][j]+=a[i][k]*b[j][k];	
   }

void display(int c[][])
  {
	for(int i=0;i<c.length;i++)
	{
	  for(int j=0;j<c.length;j++)
	   //int c[i][j]=a[i][j]+b[i][j];
		System.out.print(" "+c[i][j]);
		System.out.println();
	} 
 }
public static void main(String args[])throws IOException
 {
	BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the limit");	
	int n=Integer.parseInt(b.readLine());
	System.out.println("Enter the first array");	
	int a[][]=new int[n][n];
	int a1[][]=new int[n][n];
	for(int i=0;i<n;i++)
	  for(int j=0;j<n;j++)
	a[i][j]=Integer.parseInt(b.readLine());	
	System.out.println("Enter the second array");
	
	for(int i=0;i<n;i++)
	  for(int j=0;j<n;j++)
	a1[i][j]=Integer.parseInt(b.readLine());
	int c[][]=new int[n][n];
 	Calculator ob = new Calculator();
	ob.add(a,a1,c);	
	ob.display(c);
	ob.sub(a,a1,c);	
	ob.display(c);
	ob.mul(a,a1,c);	
	ob.display(c);
		
 }
}
