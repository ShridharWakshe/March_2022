import java.util.*;
class Palindrome
{
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int num = sc.nextInt();
	int temp = num;
	int rev =0;
	while(num!=0)
	{
		int a = num%10;
		rev = rev*10+a;
		num = num/10;
	
	}
	if(temp == rev)
		System.out.println("digit of number is Palindrome");
	else
		System.out.println("digit of number is not Palindrome");
}}
