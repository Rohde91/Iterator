package Singleton;


public class EagerInitialization {
    private static int oprettet =0;
    //Instance will be created at load time
    private static EagerInitialization obj = new EagerInitialization();
    public String string;

    //Creating private constructor
    private EagerInitialization() {
        string = "Welcome to TechVidvan's Tutorial of Java";
    }

    //Declaring static method
    public static EagerInitialization getInstance() {
        if(oprettet==0) {
            oprettet=1;
            return obj;
        }
        else
           // return null;
            return obj;
    }
}
