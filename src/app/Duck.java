package app;

import app.FlyBehavior.FlyBehavior;
import app.SoundBehavior.SoundBehavior;

public abstract class Duck {

    // Asociación con las interfaces
    protected FlyBehavior flyBehavior;
    protected SoundBehavior soundBehavior;

	public Duck() {}

    /**
     * @param flyBehavior the flyBehavior to set
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * @return the flyBehavior
     */
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    /**
     * @param soundBehavior the soundBehavior to set
     */
    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    /**
     * @return the soundBehavior
     */
    public SoundBehavior getSoundBehavior() {
        return soundBehavior;
    }

    // Comportamiento de todos, dependiendo del hijo
    public abstract void display();

    // Comportamiento en comun de todos los patos
    public void swim() {
        System.out.println("Nadar");
    }

    // Implementación de interfaces
    public void performFly() {
        flyBehavior.fly();
    }

    public void performSound() {
        soundBehavior.sound();
    }
}
