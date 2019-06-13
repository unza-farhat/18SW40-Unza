class Student{
 String name;
 int age;
 String addr;
 Student(){
  this.name="unknown";
  this.age=0;
  this.addr="not available";
  }
  public void setInfo(String name,int age){
    System.out.println(this.name=name);
    System.out.println(this.age=age);
  }

  public void setInfo(String name,int age,String addr){
   System.out.println(this.name=name);
   System.out.println(this.age=age);
   System.out.println(this.addr=addr + "\n");
  }
 }
 class Lab6Task5{
  public static void main(String args[]){
   Student[] obj=new Student[10];
   obj[0]=new Student();
   obj[0].setInfo("Sahiba",18,"house no:9889 Hyderabad");
   obj[1]=new Student();
   obj[1].setInfo("Iqra",19,"house no.567 Jamshoro");
   obj[2]=new Student();
   obj[2].setInfo("Maira",19,"house no.587 Jamshoro");
   obj[3]=new Student();
   obj[3].setInfo("Unza",18,"house no.167 Mirpurkhas");
   obj[4]=new Student();
   obj[4].setInfo("Dua",19,"house no.456 Karachi");
   obj[5]=new Student();
   obj[5].setInfo("Alisha",19,"house no.477 Umerkot");
   obj[6]=new Student();
   obj[6].setInfo("Neha",19,"house no.567 Hyderabad");
   obj[7]=new Student();
   obj[7].setInfo("Mahrukh",19,"house no.345 Hyderabad");
   obj[8]=new Student();
   obj[8].setInfo("Almas",18,"house no.3556 Hyderabad");
   obj[9]=new Student();
   obj[9].setInfo("Nisa",18,"house no.677 Multan");
   }
   }