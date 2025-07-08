package Chapter4;

import Chapter4.SubPizzaStore.NYPizzaStore;

public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        
        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza1.getName() + "\n");

        Pizza pizza2 = nyStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza2.getName() + "\n");

        Pizza pizza3 = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza3.getName() + "\n");

        Pizza pizza4 = nyStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza4.getName() + "\n");
    }
}
