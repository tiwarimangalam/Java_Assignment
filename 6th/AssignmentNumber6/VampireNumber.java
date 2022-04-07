package assignment.number6;
import java.util.Arrays;
//import java.util.Scanner;

public class VampireNumber {
    public static int countDigits(Long n) // count the number of digits
    {
        int c=0;
        while (n>0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public static boolean vampireCheck(long n)
    {
        int length=countDigits(n);
        if(length%2==1)
        {
            return  false;
        }
        for(long first = (long) Math.pow(10,length/2-1); first<(long)Math.pow(10,length/2);first++)
        {
            //int flag=0;
            if(n%first==0)
            {
                long second=n/first;
                if((second>=Math.pow(10,length/2-1) && second<Math.pow(10,length/2)))
                {
                    String mainStr="";
                    String subStr1="";
                    String suStr2="";
                    String subStr="";
                    mainStr+=n;
                    subStr1+=first;
                    suStr2+=second;
                    subStr+=subStr1+suStr2;
                    char mainCharArray[]=mainStr.toCharArray();
                    Arrays.sort(mainCharArray);
                    char subCharArray []=subStr.toCharArray();
                    Arrays.sort(subCharArray);
                    mainStr=new String(mainCharArray);
                    subStr=new String(subCharArray);
                    if(mainStr.equals(subStr))
                    {
                        System.out.println(first+"*"+second+"="+first*second);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int c=0;
        System.out.println("First 100 Vampire numbers are: ");
            for(long i=1260;c<100;i++)
            {
                boolean b=vampireCheck(i);
                if(b==true)
                {
                    c++;
                }
            }
            //System.out.println("The value of c is: "+c);
    }
}
