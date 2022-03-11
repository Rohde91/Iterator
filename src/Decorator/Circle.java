package Decorator;


public class Circle implements Decorator.Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
