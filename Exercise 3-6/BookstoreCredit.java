import java.util.Scanner;
public class BookstoreCredit {
    static Scanner scan = new Scanner(System.in);
    public static void main (String args[]) 
    {
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Enter your gpa");
        double gpa = scan.nextDouble();

        computeDiscount(name,gpa);
    }

    public static void computeDiscount(String name, double gpa) {
        double math = gpa*10;
        System.out.println(name+", your GPA is "+gpa+", so your credit is $"+math);
    }

}
