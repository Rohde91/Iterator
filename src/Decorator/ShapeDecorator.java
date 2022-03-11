package Decorator;

public abstract class ShapeDecorator implements Decorator.Shape {
    protected Decorator.Shape decoratedShape;

    public ShapeDecorator(Decorator.Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
