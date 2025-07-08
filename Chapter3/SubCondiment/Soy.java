package Chapter3.SubCondiment;

import Chapter3.CondimentDecorator;
import Chapter3.Beverage;

public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.16 + beverage.cost();
    }
    
}
