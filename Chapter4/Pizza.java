package Chapter4;

import java.util.ArrayList;

public class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350 degrees");
        // 披萨已烘烤
    }

    void cut() {
        System.out.println("Cutting the pizza into slices");
        // 披萨已切片
    }

    void box() {
        System.out.println("Placing pizza in official PizzaStore box");
        // 披萨已打包
    }

    public String getName() {
        return name;
    }

}
