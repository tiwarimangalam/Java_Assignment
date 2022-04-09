package number7;
 class Cycle
{
     void wheels()
    {
        System.out.println("depends on type of the cycle");
    }
}
class UniCycle extends Cycle
{
    void balance()
    {
        System.out.println("This is Unicycle's balance method");
    }

    @Override
    void wheels() {
        System.out.println("1 wheel");
    }
}
class BiCycle extends Cycle
{
    void balance()
    {
        System.out.println("This is Bicycle's balance method");
    }

    @Override
    void wheels() {
        System.out.println("2 wheels");
    }
}
class TriCycle extends Cycle
{

    @Override
    void wheels() {
        System.out.println("3 wheels");
    }
}
public class AssignmentNumber7B {
    public static void main(String[] args) {
        Cycle [] upcastObject=new Cycle[3];
        upcastObject[0]=new UniCycle();// Upcasting
        upcastObject[1]=new BiCycle();// Upcasting
        upcastObject[2]=new TriCycle();// Upcasting
        // upcastObject[0].balance();=> this will be giving compile time error
        UniCycle downcastObject1= (UniCycle) new Cycle(); // Down casting explicitly
        BiCycle downcastObject2= (BiCycle) new Cycle();   // Down casting explicitly
        TriCycle downcastObject3=(TriCycle) new Cycle();  //  Down casting explicitly
        downcastObject1.balance();
        downcastObject2.balance();
        /* exception will occur
        Exception in thread "main" java.lang.ClassCastException: class number7.Cycle cannot be cast to class number7.
        UniCycle (number7.Cycle and number7.UniCycle are in unnamed module of loader 'app')
	    at number7.AssignmentNumber7B.main(AssignmentNumber7B.java:48)
         */

    }
}
