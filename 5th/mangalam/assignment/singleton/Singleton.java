package mangalam.assignment.singleton;

public class Singleton {
    String s;
    public static Singleton myFun(String str)
    {
        // Non-static field 's' cannot be referenced from a static context
        //s=str;
        Singleton st=new Singleton();
        return st;
    }
    public void print()
    {
        System.out.println("The String is: "+s);
    }
}
