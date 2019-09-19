package app.SoundBehavior;

/**
 * Mute
 */
public class Mute implements SoundBehavior{

    public Mute(){

    }

    @Override
    public void sound() {
        System.out.println("El pato no hace sonido");
    }
}