import java.util.*;
class Array
{
   int x[]=new int[5];
   public void PopulateArray()
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Elements:");
   for(int i=0; i<5; i++)
   {
    x[i]=sc.nextInt();
   }
   }
   public void display()
   {
   System.out.println("Even Numbers:");
   for(int i=0; i<5; i++){
   if(x[i]%2!=0)
   continue;
   System.out.print(x[i]+ " ");
   }
   System.out.println();
   System.out.println("Odd Numbers:");
   for(int i=0; i<5; i++){
   if(x[i]%2==0)
   continue;
   System.out.print(x[i]+ " ");
   }
   }
}
class Arr
{
   public static void main(String [] args)
   {
   Array A1=new Array();
   A1.PopulateArray();
   A1.display();
   }
}
