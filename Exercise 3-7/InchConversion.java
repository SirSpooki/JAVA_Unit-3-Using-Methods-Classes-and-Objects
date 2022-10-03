import java.util.Scanner;
public class InchConversion {
    static Scanner scan = new Scanner(System.in);
    public static void main (String args[]) 
    {
        System.out.println("Enter inches:");
        int inches = scan.nextInt();

        convertToFeet(inches);
        convertToYards(inches);

    }

    public static void convertToFeet(int inches) 
    {
        double feet = (double)inches/12;
        System.out.println(inches+" inches is "+feet+" feet");
    }
    public static void convertToYards(int inches) 
    {
        double yards = (inches/(double)36);
        System.out.println(inches+" inches is "+yards+" yards");
    }
}
