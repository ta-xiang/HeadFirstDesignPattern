package Chapter1;

import Chapter1.SubFlyBehavior.FlyWithWings;

public abstract class DuckDisplayDemo {
    public static void main(String[] args) {
        // 创建一个鸭子实例
        Duck duck = new Duck() {
            @Override
            public void display() {
                System.out.println("I am a duck!");
            }
        };

        // 执行鸭子的行为

        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
        duck.performQuack();
        duck.swim();
        duck.display();
    }
    
}
