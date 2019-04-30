class FoundArr
{
  public static void main(String [] args)
  {
    int x;
	x=Integer.parseInt(args[0]);
	int[] arr={4,8,5,7,2};
	
	Boolean found= false;
	for(int a:arr)
	{
	if(a==x)
	{
	  found=true;
	  break;
	}
	}
	if(found)
	  System.out.println(x+ " is found ");
	  else
	  System.out.println(x+ " is not found ");
	  for(int y=0; y<arr.length; y++)
	  {
	  if(arr[y]==x)
	  {
	  System.out.println("Position of " +x  +  " is " +y);
	  break;
	  }
	  }
  }
}