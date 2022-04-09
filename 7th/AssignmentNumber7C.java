package number7;
interface First
{
    void a1();
    void a2();
}
interface Second
{
    void b1();
    void b2();
}
interface Third
{
    void c1();
    void c2();
}
interface Fourth extends First,Second,Third
{
    void d();
}
class ConcreteClass
{
    void cc()
    {
        System.out.println("Concrete Class method");
    }
}
class NewClass extends ConcreteClass implements Fourth
{

    @Override
    public void a1() {
        System.out.println(" 1st method of Interface First");
    }

    @Override
    public void a2() {

    }

    @Override
    public void b1() {
        System.out.println(" 1st method of Interface Second");
    }

    @Override
    public void b2() {

    }

    @Override
    public void c1() {
        System.out.println(" 1st method of Interface Third");
    }

    @Override
    public void c2() {

    }

    @Override
    public void d() {
        System.out.println(" only method of Interface Fourth");
    }
}
public class AssignmentNumber7C {
    public static void m1(First a)
    {
        a.a1();
    }
    public static void m2(Second b)
    {
        b.b1();
    }
    public static void m3(Third c)
    {
        c.c1();
    }
    public static void m4(Fourth d)
    {
        d.d();
    }
    public static void main(String[] args) {
        NewClass nc=new NewClass();
        m1(nc);
        m2(nc);
        m3(nc);
        m4(nc);
    }
}
