import java.util.*;
class Table
{
  public static void main(String [] args)
  {
    Scanner i=new Scanner(System.in);
	System.out.println("Enter Table:");
	int t=i.nextInt();
	System.out.println("Enter Starting point:");
	int s=i.nextInt();
	System.out.println("Enter Ending Point:");
	int e=i.nextInt();
	int ans;
	for(int x=s; x<=e; x++)
	{
        ans=t*x;
	System.out.println(t+ "X"+ x+ "=" +ans);
	}
  }
}