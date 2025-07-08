package Chapter3.SubBeverage;

import Chapter3.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }


    @Override
    public double cost() {
        return 0.89;
    }
    
}
