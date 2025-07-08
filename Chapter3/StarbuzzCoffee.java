package Chapter3;

import Chapter3.SubBeverage.Espresso;
import Chapter3.SubBeverage.DarkRoast;
import Chapter3.SubBeverage.HouseBlend;
import Chapter3.SubCondiment.Mocha;
import Chapter3.SubCondiment.Soy;
import Chapter3.SubCondiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {

// 创建一杯什么也不加的Espresso
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        
//创建一杯加了调料的DarkRoast
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

//创建一杯加了调料的HouseBlend
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
    
}
