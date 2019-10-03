package app;

import app.FlyBehavior.FlyWithWings;
import app.SoundBehavior.Quack;

/**
 * Dog
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        flyBehavior = new FlyWithWings();
        soundBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck picture");
    }
}
