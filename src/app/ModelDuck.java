package app;

import app.FlyBehavior.FlyNoWay;
import app.SoundBehavior.Mute;

/**
 * ModelDuck
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        super();
        flyBehavior = new FlyNoWay();
        soundBehavior = new Mute();
    }

    public void display() {
        System.out.println("ModelDuck picture");
    }
}