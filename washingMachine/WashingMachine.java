package washingMachine;

public class WashingMachine {
    String brand="Samsung";
    String type="normal";
    String capacity="10 kg";

    public void rinse()
    {
        System.out.println("created washingMachine class");
    }
    public void show()
    {
        System.out.println("the washing machine brand is :"+brand);
        System.out.println("the washing machine type :"+type);
        System.out.println("the washing machine capacity :"+capacity);
    }
}