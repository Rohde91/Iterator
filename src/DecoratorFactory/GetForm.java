package DecoratorFactory;

public class GetForm {

    public Form getFigure(String formType){
        if(formType == null){
            return null;
        }
        if(formType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        else if(formType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        else if(formType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }
}
