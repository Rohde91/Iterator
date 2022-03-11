package DecoratorFactory;

abstract class Form {

    //protected double rate;
    //protected String coler;
    abstract void getForm();

    public void borderColorOutput(String Color){
        System.out.println("Coler of choice: " + Color);
    }
}
