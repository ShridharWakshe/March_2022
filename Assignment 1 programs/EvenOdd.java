import java.util.Scanner;
class EvenOdd
{
  public static void main(String []args)
  {
    Scanner abc = new Scanner(System.in);
    System.out.println("Enter a Number ");
	int c = abc.nextInt();
    if(c%2==0){
     System.out.println(c+" is a even Number"); 
  }
     else 	
     System.out.println(c+" is a odd Number"); 	 
  }
}