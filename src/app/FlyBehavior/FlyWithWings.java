package app.FlyBehavior;

/**
 * FlyWithWings especializa de FlyBehavior
 */
public class FlyWithWings implements FlyBehavior {

    public FlyWithWings() {}

    @Override
    public void fly() {
        System.out.println("El pato vuela");
    }
}
