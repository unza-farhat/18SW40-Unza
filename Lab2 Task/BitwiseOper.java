class BitwiseOper
{
public static void main (String [] args)
 {
  int x=47;
  int y=19;
  int z=0;
  
  z=x&y;
  System.out.println("x&y=" +z);
  
  z=x|y;
  System.out.println("x|y=" +z);
  
  z=x^y;
  System.out.println("x^y=" +z);
  
  z=~x;
  System.out.println("~x=" +z);
  
  z=x<<2;
  System.out.println("x<<2=" +z);
  
  z=x>>2;
  System.out.println("x>>2=" +z);
  
  z=x>>>2;
  System.out.println("x>>>2=" +z);
 }
}