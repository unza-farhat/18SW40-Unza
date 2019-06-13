class Methods
{
   public void display(char ch,int no)
   {
    System.out.println("Char:" + ch + " " + "Integer:" + no);
   }
   public void display(int no,char ch)
   {
    System.out.println("Integer:" + no + " " + "Char:" + ch);
	}
}
class Methods1
{
 public static void main(String [] args)
 {
   Methods obj=new Methods();
   obj.display('i',4);
   obj.display(6,'j');
 }
}