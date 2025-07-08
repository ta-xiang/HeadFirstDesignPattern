package Chapter4.SubPizzaStore;

import Chapter4.PizzaStore;
import Chapter4.Pizza;

import Chapter4.SubPizza.NYStyleCheesePizza;
import Chapter4.SubPizza.NYStyleVeggiePizza;
import Chapter4.SubPizza.NYStyleClamPizza;
import Chapter4.SubPizza.NYStylePepperoniPizza;



public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }
}
