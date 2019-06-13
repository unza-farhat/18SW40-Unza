class Book1{
 private String name;
 private Author author;
 private double price;
 private int qty;
 public Book1(String name,Author author, double price,int qty)
 {
  this.name=name;
  this.author=author;
  this.price=price;
  this.qty=qty;
 }
 public String getName(){
  return name;
 }
 public Author getAuthor(){
 return author;
 }
 public double getPrice(){
  return price;
 }
 public void setPrice(double price){
  this.price=price;
 }
 public int getQty(){
  return qty;
 }
 public void setQty(int qty){
 this.qty=qty;
 }
 public String toString(){
  return "'" + name + " ' by " + author;
  }
 }
 class Book{
  public static void main(String args[])
  {
   Author A1=new Author("kim jun","kimjun@gmail.com",'M');
   System.out.println(A1);
   Book b=new Book("Friends Forever" ,A1,9.99,99);
   System.out.println(b);
   b.setPrice(9.89);
    b.setQty(87);
   System.out.println(b);
   System.out.println("Name is " + b.getName());
   System.out.println("Price is " + b.getPrice());
   System.out.println("Quantity is " + b.getQty());
   System.out.println("Author is " + b.getAuthor());
   System.out.println("Author's name is " + b.getAuthor().getName());
   System.out.println("Author's email is " + b.getAuthor().getEmail());
   System.out.println("Author's gender is " + b.getAuthor().getGender());
   Book b2=new Book("Friends Never Died",new Author("jeon alsey ","alsey@gmail.com",'M'),16.99,7);
   System.out.println(b2);
   }
  }