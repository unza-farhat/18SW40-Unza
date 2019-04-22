import java.util.*;
class Vowel
{
  public static void main(String [] args)
  { 
    Scanner i=new Scanner(System.in);
	System.out.println("Enter Character:");
	char ch=i.next().charAt(0);
	switch(ch)
	{
	case 'a':
	{
	System.out.println("Vowel");
	}
	break;
	case 'e':
	{
	System.out.println("Vowel");
	}
	break;
	case 'i':
	{
	System.out.println("Vowel");
	}
	break;
	case 'o':
	{
	System.out.println("Vowel");
	}
	break;
	case 'u':
	{
	System.out.println("Vowel");
	}
	break;
	default:
	{
	System.out.println("Consonent");
	}
	}
  }
}