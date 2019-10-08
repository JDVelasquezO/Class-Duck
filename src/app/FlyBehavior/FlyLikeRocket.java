package app.FlyBehavior;

/**
 * FlyLikeRocket
 */
public class FlyLikeRocket implements FlyBehavior{

    public FlyLikeRocket() {}

    @Override
    public void fly() {
        System.out.println("El pato vuela como cohete");
    }
}