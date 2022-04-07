package assignment.number6;

public class OverloadedClass {
    OverloadedClass()
    {
        this(5);
        System.out.println("Default constructor");
    }
    OverloadedClass(int x)
    {
        System.out.println("Parameterised constructor: "+x);
    }

}
