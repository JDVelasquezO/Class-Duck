package app;

import app.FlyBehavior.FlyNoWay;
import app.SoundBehavior.Mute;

/**
 * DecoyDuck
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super();
        super.flyBehavior = new FlyNoWay();
        super.soundBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck picture");
    }
}