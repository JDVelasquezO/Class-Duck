package app;

import app.FlyBehavior.FlyWithWings;
import app.SoundBehavior.Quack;

/**
 * Cat
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super();
        flyBehavior = new FlyWithWings();
        soundBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck picture");
    }
}
