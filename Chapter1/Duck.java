package Chapter1;

import Chapter1.SubFlyBehavior.FlyNoWay;
import Chapter1.SubQuackBehavior.MuteQuack;


public abstract class Duck {
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  // 构造函数
  // 默认情况下，鸭子不会飞，也不会叫
  public Duck() {
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new MuteQuack();
  }

  public void swim() {
    System.out.println("I can swim!");
  }

  // 抽象方法，子类必须实现
  // 每种鸭子都有自己的显示方式
  abstract public void display();

  public void performFly(){
    flyBehavior.fly();
  }

  public void performQuack(){
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}

