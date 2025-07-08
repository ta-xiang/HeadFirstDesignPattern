package Chapter3.SubCondiment;

import Chapter3.CondimentDecorator;
import Chapter3.Beverage;

public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return 0.12 + beverage.cost();
    }
    
}
