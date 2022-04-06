import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AssignmentNumber2 {
    public static void main(String[] args) {
        /*
        Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
        Write time and space complexity of your solution as comments in the source file.
         */
        System.out.println("Enter the string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase(Locale.ROOT);
        Checker ch=new Checker();
        boolean result=ch.checkerFunction(str);
        if(result==true)
        {
            System.out.println("Yes, Input string contains all the letters of the alphabet a-z (case-insensitive)");
        }
        else
        {
            System.out.println("No, Input string doesn't contain all the letters of the alphabet a-z (case-insensitive)");
        }
    }
}
