import java.util.Scanner;
class JobPricing {
    public static void main(String[] args) {
        String description;
        double materials;
        double hoursOnJob;
        double hoursTraveling;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter job description >> ");
        description = input.nextLine();
        System.out.print("Enter cost of materials >> ");
        materials = input.nextDouble();
        System.out.print("Enter hours on the job work >> ");
        hoursOnJob = input.nextDouble();
        System.out.print("Enter hours traveling >> ");
        hoursTraveling = input.nextDouble();
        price = computePrice(materials, hoursOnJob, hoursTraveling);
        System.out.println("The price for " + description +
                           " is $" + price);
    }

    public static double computePrice(double materials, double hours, double travel) 
    {
        double hourCost, travelCost, overallCost;
        
        hourCost = hours*35;
        travelCost = travel*12;
        overallCost = materials+hourCost+travelCost;
        return overallCost;


    }
}
