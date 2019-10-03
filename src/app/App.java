package app;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck rubberDuck = new RubberDuck();
        
        // Accedemos al método de la interface
        mallardDuck.performSound();
        rubberDuck.performSound();
        decoyDuck.performSound();
    }
}
