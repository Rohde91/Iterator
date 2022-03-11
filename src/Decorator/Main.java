package Decorator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Decorator.Shape circle = new Circle();

        Decorator.Shape redCircle = new Decorator.RedShapeDecorator(new Circle());
        Decorator.Shape blueCircle = new Decorator.BlueShapeDecorator(new Circle());
        // denne modtager også new Circle()

        Decorator.Shape redRectangle = new Decorator.RedShapeDecorator(new Decorator.Rectangel());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nCircle of blue border");
        blueCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
