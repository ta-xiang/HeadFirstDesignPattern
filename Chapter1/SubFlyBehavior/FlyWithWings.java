package Chapter1.SubFlyBehavior;

import Chapter1.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I have wings, so I can fly!");
  }
}
