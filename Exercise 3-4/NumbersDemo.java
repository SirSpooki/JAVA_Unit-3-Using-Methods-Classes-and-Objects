public class NumbersDemo {
    public static void main (String args[]) 
    {
        int n;

        displayTwiceTheNumber(4);
        displayNumberPlusFive(4);
        displayNumberSquared(4);

        displayTwiceTheNumber(33);
        displayNumberPlusFive(33);
        displayNumberSquared(33);





    }
    public static void displayTwiceTheNumber(int n) 
    {
        int timesTwo = n*2;
        System.out.println(n+" times 2 is "+ timesTwo);
    }
    public static void displayNumberPlusFive(int n) 
    {
        int plusFive = n+5;
        System.out.println(n+" plus 5 is "+ plusFive);
    }
    public static void displayNumberSquared(int n) 
    {
        int squared = n*n;
        System.out.println(n+" squared is "+ squared);
    }
}
