class Student {
    // the private data members
    private int idNumber;
    private int hours;
    private int points;

    // Constructor added in part c
    Student() 
    {
        idNumber = 9999;
        hours = 3;
        points = 12;
    }
    // end of constructor added in part c

    // the public get and set methods

    public void setIdNumber(int number) 
    {
        idNumber = number;
    }

    public int getIdNumber() 
    {
        return idNumber;
    }

    public void setHours(int number) 
    {
        hours = number;
    }

    public int getHours() 
    {
        return hours;
    }

    public void setPoints(int number) 
    {
        points = number;
    }

    public int getPoints() 
    {
        return points;
    }

    // methods to display the fields

    public void showIdNumber() 
    {
         System.out.println("ID Number is: "+idNumber);
    }

    public void showHours() 
    {
        System.out.println("Credit Hours: " + hours);
    }

    public void showPoints() 
    {
        System.out.println("Points Earned: "+points);
    }

    public double getGradePoint() 
    {
        double getGradePoint = (double)points/hours;
        return getGradePoint;
    }
}
