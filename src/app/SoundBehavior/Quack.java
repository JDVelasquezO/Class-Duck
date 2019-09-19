package app.SoundBehavior;

/**
 * Quack
 */
public class Quack implements SoundBehavior {

    public Quack() {

    }

    @Override
    public void sound() {
        System.out.println("El pato hace quack");
    }
}