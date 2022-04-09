package number7;
class OuterClass
{
    class InnerClass1
    {
        InnerClass1(String s)
        {
            System.out.println("The string of the inner class is: "+s);
        }
    }
    class InnerClass2 extends InnerClass1
    {

        InnerClass2(String s) {
            super(s);
        }
    }
}
public class AssignmentNumber7D {
    public static void main(String[] args) {
        OuterClass.InnerClass2 oic=new OuterClass().new InnerClass2("Mangalam Tiwari");
    }
}
