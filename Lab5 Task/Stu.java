class Stu
{
  String n;
  int rollno;
  int a;
}
  class MrkSht
{  
  int DCLD;
  int java;
  int r;
  double per;
}  
  class result
{
  Stu s;
  MrtSht m;
  result(Stu s1,MrkSht m1)
  {
   s=s1; 
   m=m1;
  }
  public void creteStudentResult()
  {
   System.out.println("Name:" +s.n);
   System.out.println("Rollno:" +rollno);
   System.out.println("Age:" +s.a);
   System.out.println("Marks in DCLD:" +m.DCLD);
   System.out.println("Marks in java:" +m.java);
   System.out.println("Total Marks:" +(m.DCLD+m.java));
   System.out.println("Percentage:" +(m.DCLD+m.java)*100/200);
  }
}
class StuMark
{
 public static void main(String [] args)
 {
  Stu S=new Stu();
  MrkSht M=new MrkSht();
  s.n="Unza";
  s.rollno=40;
  s.a=19;
  m.DCLD=88;
  m.java=78;
  result r=new result(s,m);
  r.creteStudentResult();
 }
}