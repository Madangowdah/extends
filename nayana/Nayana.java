package nayana;

import washingMachine.WashingMachine;

public class Nayana {
    public void buy()
    {
        System.out.println("created with local variable");
        WashingMachine washingMachine=new WashingMachine();
        washingMachine.rinse();
        washingMachine.show();
    }
}
