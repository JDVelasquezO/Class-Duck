package app.SoundBehavior;

/**
 * Squeak
 */
public class Squeak implements SoundBehavior {

    public Squeak() {

    } 

    @Override
    public void sound() {
        System.out.println("El pato hace squeack");
    }
}