package DecoratorFactory;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String args[])throws IOException{
        GetForm planForm = new GetForm();

        System.out.print("Enter the shape you want to create: ");

        Scanner input = new Scanner(System.in);

        String shapeInput=input.next();

        System.out.print("Enter the color you want for the border: ");

        String borderColor = input.next();

        Form p = planForm.getFigure(shapeInput);

        System.out.print("Shape: " + shapeInput + " with " + borderColor + " border " );

        p.getForm();
        // Der kan laves lignende funktionalitet på farverne.

        p.borderColorOutput(borderColor);

    }
}