import java.util.*;
class SumInteger
{
  public static void main(String [] args)
  {
  int a,n,x;
  x=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Number:");
  n=sc.nextInt();
  sc.close();
  for(a=1; a<=n; a++)
  {
   x=x+n;
  }
  System.out.println("Sum of First " +n + " Natural Number is: " +x);
  }
}