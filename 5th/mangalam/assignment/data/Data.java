package mangalam.assignment.data;

public class Data {
    // declaration of variables;
    int i;
    char c;

    public void print1() {
        System.out.println("Value of integer: " + i);
        System.out.println("Value of char is: " + c);
    }

    public void print2() {
        int i;
        char c;
       // System.out.println("Value of integer: "+i);
        //System.out.println("Value of char is: "+c);
        /*
        This one is throwing compile time error that variables are not initialized.
         */
        System.out.println("There is an error that variables are not initialized");
    }

}