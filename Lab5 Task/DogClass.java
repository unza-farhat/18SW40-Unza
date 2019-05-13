class Dog
{
  private String name;
  private int age;
  private String breed;
  public void setDetails(String name,int age,String breed)
  {
   this.name=name;
   this.age=age;
   this.breed=breed;
  }
  public void showDetails()
  {
   if(name!=null && age!=0 && breed!=null)
   {
    System.out.println("Name:" +name);
	System.out.println("Age:" +age);
	System.out.println("Breed:" +breed);
   }
   else
   {
    System.out.println("Details not Available");
   }
  }
}
class DogClass
{
  public static void main(String [] args)
  {
    Dog D1=new Dog();
	D1.setDetails("Dexter",12,"American Eskimo");
	D1.showDetails();
  }
}