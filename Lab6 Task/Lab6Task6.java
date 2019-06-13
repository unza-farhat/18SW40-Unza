class Static
{
 int rollno;
 String name;
 static String Department_Name="Software";
 }
 class Lab6Task6{
 public static void main(String args[]){
  Static s=new Static();
  s.rollno=19;
  s.name="Sahiba";
  System.out.println(s.rollno);
  System.out.println(s.name);
  System.out.println(Static.Department_Name);
  Static s1=new Static();
  s1.rollno=49;
  s1.name="Alisha";
  System.out.println(s1.rollno);
  System.out.println(s1.name);
  System.out.println(Static.Department_Name);
  }
  }