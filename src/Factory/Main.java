package Factory;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String args[])throws IOException{
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);

        //String planName=br.readLine();
        String planName=sc.next();

        System.out.print("Enter the number of units for bill will be calculated: ");
        //int units=Integer.parseInt(br.readLine());

        int units=sc.nextInt();

        Factory.Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        // p kommer fra ovenstående Plan p
        // p.gerRate() ligger i DomesticPlan.java
        p.calculateBill(units);
        // p kommer fra ovenstående Plan p
        // p.calculateBill(units) ligger i Plan.java
    }
}//end of GenerateBill class.
