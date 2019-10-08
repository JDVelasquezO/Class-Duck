package app;

import app.FlyBehavior.FlyBehavior;
import app.FlyBehavior.FlyLikeRocket;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck rubberDuck = new RubberDuck();
        Duck modelDuck = new ModelDuck();
        
        // Accedemos al método de la interface
        mallardDuck.performSound();
        rubberDuck.performSound();
        decoyDuck.performSound();
        // System.out.println("-------------------------Pato modelo: ---------------------------");
        modelDuck.performFly();
        FlyBehavior flyLikeRocket = new FlyLikeRocket();
        modelDuck.setFlyBehavior(flyLikeRocket);
        modelDuck.performFly();
    }
}
