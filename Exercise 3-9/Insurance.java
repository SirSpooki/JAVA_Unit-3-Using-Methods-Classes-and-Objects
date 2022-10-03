import java.util.Scanner;
class Insurance {
    public static void main (String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        int curr, birth;
        System.out.println("Enter the current Year: ");
        curr = scan.nextInt(); 
        System.out.println("Enter the birth year:");
        birth = scan.nextInt();

        calculatePremium(curr, birth);

    }

    public static int calculatePremium(int curr, int birth) 
    {
        int age, premium, decade;
        age = curr - birth;
        decade = age/10;
        premium = (decade+15)*20;
        System.out.println("The premium is $"+premium);
        return premium;

    }
}
