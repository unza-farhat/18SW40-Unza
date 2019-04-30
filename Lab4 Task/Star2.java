class Star2
{
  public static void main(String [] args)
  {
	int y=1;
    for(int i=1; i<=5; i++)
	{
	for(int j=5; j>=i; j--)
	{
	System.out.print(" ");
	}
	for(int k=1; k<=y; k++)
	{
	System.out.print("*");
	}
	y=y+2;
	System.out.println();
	}
  }
}