package mangalam.assignment.main;

import mangalam.assignment.data.Data;
import mangalam.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data d=new Data();
        d.print1();
        d.print2();
        Singleton sg=new Singleton();
        sg.print();
    }

}
