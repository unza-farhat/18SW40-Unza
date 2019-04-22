import java.util.Scanner;
class MarkSheet
{
  public static void main(String [] args)
  {
    Scanner i=new Scanner(System.in);
	System.out.println("Enter Obtained Marks in C++,Data Structure and Operating System");
	int a=i.nextInt();
    int b=i.nextInt();
	int c=i.nextInt();
	int Sum=a+b+c;
	float per=Sum*100/300;
	System.out.println("Total Marks:" +Sum);
	System.out.println("Percentage:" +per);
	if(per>90){
	System.out.println("Grade:A");
	}
	else if(per<=90 && per>=80 ){
	System.out.println("Grade:B");
	}
	else if(per<=79 && per>=70){
	System.out.println("Grade:C");
	}
	else if(per<=69 && per>=60){
	System.out.println("Grade:D");
	}
	else if(per<60){
	System.out.println("Grade:Fail");
	}
  }
}