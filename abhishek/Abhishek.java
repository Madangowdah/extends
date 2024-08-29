package abhishek;

import washingMachine.WashingMachine;

public class Abhishek {
    public WashingMachine washingMachine;

    public void order()
    {
        System.out.println("created with instance type");
        WashingMachine washingMachine=new WashingMachine();
        washingMachine.rinse();
        washingMachine.show();
    }
}
