import java.util.*;
class Question15
{
    public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number 1 = ");
	int a = sc.nextInt();
	System.out.println("Enter Number 2 = ");
	int b = sc.nextInt();
	int c = a+b;
	int d = c-b;
	int e = c-d;
	System.out.println("Numbers after Swapping are "+(d)+" "+(e));
	}
}