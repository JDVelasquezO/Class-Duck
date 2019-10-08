package app;

import app.FlyBehavior.FlyNoWay;
import app.SoundBehavior.Squeak;

/**
 * RubberDuck
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.flyBehavior = new FlyNoWay();
        super.soundBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck picture");
    }
}