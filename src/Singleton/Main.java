package Singleton;

public class Main {


        public static void main(String args[])
        {
            EagerInitialization text = EagerInitialization.getInstance();
            //original string
            System.out.println("Original String:");
            System.out.println(text.string);
            //text in upper case
            System.out.println("String in Upper Case:");
            text.string = (text.string).toUpperCase();
            System.out.println(text.string);
            EagerInitialization text1 = EagerInitialization.getInstance();
            System.out.println(text1.string);
        }
    }

