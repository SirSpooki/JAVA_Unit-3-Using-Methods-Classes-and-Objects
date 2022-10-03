import java.util.Scanner;
public class PaintCalculator {
    public static void main (String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        double length, width, height;

        System.out.println("Enter Length");
        length = scan.nextDouble();
        System.out.println("Enter Width");
        width = scan.nextDouble();
        System.out.println("Enter Height");
        height = scan.nextDouble();

        double area = computeArea(length, width, height);
        double price =  computeGallons(area);

    }

    public static double computeArea(double length, double width, double height) 
    {
        double area;
        area = ((length*height)*2)+((height*width)*2);
        return area;
    }
    public static double computeGallons(double area) 
    {
     double gallons, price;
     gallons = area/350;
     System.out.println("You will need: "+gallons+" gallons");
     price = gallons*32;
     System.out.println("The price to paint the room is $"+price);
     return price;
    
    }
}
