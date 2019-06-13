class Author
{
  private String name;
  private String email;
  private char gender;
  public Author(String name,String email,char gender){
  this.name=name;
  this.email=email;
  this.gender=gender;
  }
  public String getname(){
  return name;
  }
  public void setemail(String email){
  this.email=email;
  }
    public String getemail(){
  return email;
  }
  public char getgender(){
  return gender;
  }
  public String toString()
  {
  return"Author[name="+name+",email="+email+",gender="+gender+"]";
  }
}
class Author123
{
  public static void main(String [] args)
  {
  Author A1=new Author("Rose Albert","Rose123@gmail.com",'F');
  A1.setemail("Albert345@gmail.com");
  System.out.println(A1);
  System.out.println("Name is:" +A1.getname());
  System.out.println("Gender is:" +A1.getgender());
  System.out.println("Email is:" +A1.getemail());
  
  }
}