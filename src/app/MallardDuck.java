package app;

import app.FlyBehavior.FlyWithWings;
import app.SoundBehavior.Quack;

/**
 * Dog
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        super.flyBehavior = new FlyWithWings();
        super.soundBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck picture");
    }
}
