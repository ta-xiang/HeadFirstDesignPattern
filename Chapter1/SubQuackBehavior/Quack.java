package Chapter1.SubQuackBehavior;

import Chapter1.QuackBehavior;

public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("quack");
  }
}