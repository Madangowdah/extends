package megha;

import washingMachine.WashingMachine;

public class Megha {


    public void buy()
    {
        System.out.println("created with local variable");
        WashingMachine washingMachine=new WashingMachine();
        washingMachine.rinse();
        washingMachine.show();
    }
}
