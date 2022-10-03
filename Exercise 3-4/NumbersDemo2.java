import java.util.Scanner;
public class NumbersDemo2
{
    static Scanner scan = new Scanner(System.in);
    public static void main (String args[])
   {
      System.out.println("Enter an integer ");
      int num1 = scan.nextInt();
      System.out.println("Enter an another integer ");
      int num2 = scan.nextInt();

      displayTwiceTheNumber(num1);
      displayNumberPlusFive(num1);
      displayNumberSquared(num1);
      displayTwiceTheNumber(num2);
      displayNumberPlusFive(num2);
      displayNumberSquared(num2);
   }
   public static void displayTwiceTheNumber(int n)
   {
      final int FACTOR = 2;
      System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
   }
   public static void displayNumberPlusFive(int n)
   {
      final int FACTOR = 5;
      System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
   }
   public static void displayNumberSquared(int n)
   {
      System.out.println(n + " squared is " + (n * n)); 
   }
}
