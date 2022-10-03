public class Percentages {
    public static void main (String args[]) 
    {
        computePercent(2,5);
    }
    public static void computePercent(double x, double y) 
    {
        double math = (x/y)*100;
        System.out.println(x + " is "+math+" percent of "+y);

        double math2 = (y/x)*100;
        System.out.println(y + " is "+math2+" percent of "+x);
    }
}
