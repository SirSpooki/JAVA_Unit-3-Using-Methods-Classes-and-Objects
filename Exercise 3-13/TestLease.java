import java.util.Scanner;
class TestLease
{
   static Scanner scan = new Scanner(System.in);
   public static void main (String args[])
   {
     Lease Lease1 = getData();
     showValues(Lease1);

     Lease Lease2 = getData();
     showValues(Lease2);

     Lease Lease3 = getData();
     showValues(Lease3);

     Lease Lease4 = new Lease();
     showValues(Lease4);
     
    
   }
   public static void showValues(Lease ls)
   {
      System.out.println("\n\nYour lease results:" +
         "\nName      : " + ls.getName() +
         "\nApartment : " + ls.getAptNumber() +
         "\nRent      : " + ls.getRent() +
         "\nTerm      : " + ls.getTerm());
   }
   public static Lease getData()
   {
       Lease Default = new Lease();
       
       System.out.println("Enter lessee name ");
       String tenant = scan.nextLine();

       System.out.println("Enter apartment number ");
       int apt = scan.nextInt();

       System.out.println("Enter Rent ");
       double monthRent = scan.nextDouble();

       System.out.println("Enter lease term in months ");
       int t = scan.nextInt();
       scan.nextLine();

        Default.setName(tenant);
        Default.setAptNumber(apt);
        Default.setRent(monthRent);
        Default.setTerm(t);
       return Default;
   }
}


