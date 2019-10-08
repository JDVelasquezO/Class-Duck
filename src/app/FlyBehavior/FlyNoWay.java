package app.FlyBehavior;

/**
 * FlyNoWay
 */
public class FlyNoWay implements FlyBehavior {

    public FlyNoWay() {}

    @Override
    public void fly() {
        System.out.println("El pato no vuela");
    }
}