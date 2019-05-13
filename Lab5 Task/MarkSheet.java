class Mark
{
  int java;
  int maths;
  int cpp;
  int r;
  double per;
  public void totalmarks()
  {
   r=java+maths+cpp;
   System.out.println("Result:" +r);
  }
  public void percentage()
  {
   per=r*100/300;
   System.out.println("Percentage:" +per);
  }
  public void grade()
  {
    if(per>90)
    System.out.println("Grade:A");
	else if(per<=90 && per>=80)
	System.out.println("Grade:B");
	else if(per<80 && per>=70)
	System.out.println("Grade:C");
	else if(per<70 && per>=60)
	System.out.println("Grade:D");
	else if(per<60)
	System.out.println("Fail");
  }
}
class MarkSheet
{
  public static void main(String [] args)
  {
  Mark M1=new Mark();
  M1.java=87;
  M1.maths=98;
  M1.cpp=92;
  M1.totalmarks();
  M1.percentage();
  M1.grade();
  }
}