import java.util.Scanner;
public class Percentages2
{
    static Scanner scan = new Scanner(System.in);
    public static void main (String args[])
   {
       System.out.println("Enter a double ");
       double num1 = scan.nextDouble();
       System.out.println("Enter a double ");
       double num2 = scan.nextDouble();
    
      computePercent(num1, num2);
      computePercent(num2, num1);
   }
   public static void computePercent(double x, double y)
   {
       // Modify the code below
       System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
   }
}
