package Chapter1.SubQuackBehavior;

import Chapter1.QuackBehavior;

public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("squeak");
  }
}
