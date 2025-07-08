package Chapter3.SubBeverage;

import Chapter3.Beverage;

public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 1.99;
    }
}
