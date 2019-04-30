class DimenArray
{
  public static void main(String [] args)
  {
   int x[][]={{1,3,4},{7,4,2},{7,6,2}};
   int y[][]={{3,7,9},{2,7,4},{4,6,2}};
   int z[][]= new int[3][3];
   for(int i=0; i<3; i++){
   for(int j=0; j<3; j++)
   {
    z[i][j]=x[i][j]+y[i][j];
	System.out.println(z[i][j]+" ");
   }
   System.out.println();
  }
}}