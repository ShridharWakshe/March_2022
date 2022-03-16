 import java.util.*;
 class Question13
 {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Width = ");  
	   float a = sc.nextFloat(); 
	   System.out.println("Height = "); 
	   float b = sc.nextFloat();  
	   System.out.println("Area is = "+(a*b));
	   System.out.println("Perimeter is = "+(2*a+2*b));
   }
}