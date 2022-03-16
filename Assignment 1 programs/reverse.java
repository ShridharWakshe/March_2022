import java.util.*;
import java.io.*;
 
import java.util.*;
class  reverse{
    public static void main(String[] args)
    {
        Scanner a = new Scanner (System.in);
		System.out.println("Enter a Number");
        int number = a.nextInt();
        String string_number = Integer.toString(number);
        for (int i = 0; i < string_number.length(); i++) {
            System.out.println(string_number.charAt(i));
        }
    }
}