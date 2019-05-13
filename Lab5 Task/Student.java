class StudentDetail
{
  String name;
  int age;
  int sec;
  String uni;
  int rollno;
  String dep;
  void setData(String n,int a,int s,String u,int r,String d)
  {
   name=n;
   age=a;
   sec=s;
   uni=u;
   rollno=r;
   dep=d;
  }
  void getData()
  {
   System.out.println("     #Student Data#");
   System.out.println("Name:" +name);
   System.out.println("Age:" +age);
   System.out.println("Section:" +sec);
   System.out.println("University:" +uni);
   System.out.println("Rollno:" +rollno);
   System.out.println("Department:" +dep);
  }
}
class Student
{
  public static void main(String [] args)
  {
    StudentDetail std=new StudentDetail();
	std.setData("Unza",19,2,"Mehran University",40,"Software");
	std.getData();
  }
}