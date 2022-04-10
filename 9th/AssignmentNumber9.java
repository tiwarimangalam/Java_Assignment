import java.util.*;
import java.util.regex.*;

public class AssignmentNumber9 {
    public static boolean sentenceChecker(String s)
    {
        String regex="^[A-Z].*\\.";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s);
        return matcher.find();
    }
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("This is the right way to practice it.");
        strList.add("Is this a right  way to practice it?");
        strList.add("Hi, this is Mangalam Tiwari.");
        strList.add("Zemoso Labs");
        for (String s: strList)
        {
            boolean res=sentenceChecker(s);
            System.out.println(s+" => "+res);
        }
    }
}