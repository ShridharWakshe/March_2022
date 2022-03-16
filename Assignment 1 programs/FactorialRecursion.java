import java.util.*;
public class FactorialRecursion 
{
    public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.println("Enter a number ");
        int num = a.nextInt();
        int factorial = abc(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static int abc(int num)
    {
        if (num >= 1)
            return num *abc(num - 1);
        else
            return 1;
    }
}