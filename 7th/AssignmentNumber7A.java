package number7;
abstract class Rodent
{
    Rodent()
    {
        System.out.println("Rodent class");
    }
    void eat()
    {
        System.out.println("Rodent is eating");
    }
    void run()
    {
        System.out.println("Rodent is running");
    }
    abstract void specification();
}
class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("Mouse Class");
    }
    void eat()
    {
        System.out.println("Mouse is eating");
    }
    void run()
    {
        System.out.println("Mouse is running");
    }

    @Override
    void specification() {
        System.out.println("Mouse moves faster than other Rodents");
    }
}
class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("Gerbil Class");
    }
    void eat()
    {
        System.out.println("Gerbil is eating");
    }
    void run()
    {
        System.out.println("Gerbil is running");
    }

    @Override
    void specification() {
        System.out.println("Gerbils moves in a leaping sort of motion");
    }
}
class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("Hamster Class");
    }
    void eat()
    {
        System.out.println("Hamster is eating");
    }
    void run()
    {
        System.out.println("Hamster is running");
    }

    @Override
    void specification() {
        System.out.println("Hamsters tend to be much less active");
    }
}
public class AssignmentNumber7A {
    public static void main(String[] args) {
        Rodent [] array=new Rodent[5];
        array[0]=new Mouse();
        array[1]=new Gerbil();
        array[2]=new Hamster();
       // array[0].eat();
        //array[0].run();
    }
}
