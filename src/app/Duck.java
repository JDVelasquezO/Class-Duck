package app;

public abstract class Duck {

	public Duck() {}
    
    // Comportamiento de todos, dependiendo del hijo
    public abstract void display();

    // Comportamiento en comun de todos los patos
    public void swim() {
        System.out.println("Nadar");
    }

    public void performanceSound() {

    }

    public void pereformanceSound() {
        
    }

}
