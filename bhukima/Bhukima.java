package bhukima;

import washingMachine.WashingMachine;

public class Bhukima {


    public WashingMachine range()
    {
        System.out.println("created with return type");
        WashingMachine washingMachine=new WashingMachine();
        washingMachine.rinse();
        washingMachine.show();
        return washingMachine;
    }
}
