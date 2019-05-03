class BubbleSort
{
  public static void bubblesort(int X[],int N)
  {
    int r,i,temp;
	for(r=1; r<=N-1; r++)
	{
	for(i=0; i<=(N-1)-r; i++)
	{
	if(X[i]>X[i+1]){
	temp=X[i];
	X[i]=X[i+1];
	X[i+1]=temp;
	}
	}
	}
  }
  public static void main(String [] args)
  {
  int array[]={5,8,2,9,3};
  int j;
  System.out.print("Array Before Sorting:");
  for(j=0; j<array.length; j++)
  {
  System.out.print(array[j]+ " ");
  }
  bubblesort(array,5);
  System.out.println();
  System.out.print("Array After Sorting:");
  for(j=0; j<array.length; j++)
  {
   System.out.print(array[j]+ " ");
  }
  }
}