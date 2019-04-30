class LargestArr
{
  public static void main(String [] args)
  {
  double arr[]={6,32,65,16,37,29,76};
  double max=arr[0];
  for(int i=1; i<7; i++)
  {
   if(arr[i]>max)
   {
    max=arr[i];
   }
  }
  System.out.println(max);
  }
}