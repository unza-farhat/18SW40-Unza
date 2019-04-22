import java.util.*;
class ArthOper
{
  public static void main(String [] args)
 {
    int x,y,z;
	char ch;
	Scanner i=new Scanner(System.in);
	System.out.println("Enter First Number:");
	x=i.nextInt();
	System.out.println("Enter Second Number:");
	y=i.nextInt();
	System.out.println("Enter any Operator(+,-,*,/):");
	ch=i.next().charAt(0);
	if(ch=='+')
	{
	  z=x+y;
	  System.out.println("Addition:" +z);
	}
	else if(ch=='-')
	{
	  z=x-y;
	  System.out.println("Subtraction:" +z);
	}
	else if(ch=='*')
	{
	   z=x*y;
	   System.out.println("Multiplication:" +z);
	}
	else if(ch=='/')
	{
	   z=x/y;
	   System.out.println("Division:" +z);
	}
	else
	{
	   System.out.println("Invalid Choice");
	}
 }
}