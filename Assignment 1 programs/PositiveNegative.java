import java.util.*;
class PositiveNegative
{
public static void main(String []args)
{
   Scanner a = new Scanner(System.in);
   System.out.println("Enter a Number");
   int b = a.nextInt();
   if(b==0)
	   System.out.println("the number is Zero");
   else if (b/-b==-1)
	   System.out.println(b+" is Positive");
   else if (b/b==1)
	   System.out.println(b+" is Negative");
	   
}
}