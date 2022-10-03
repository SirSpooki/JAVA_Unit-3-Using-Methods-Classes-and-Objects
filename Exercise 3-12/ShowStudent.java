class ShowStudent
{
   public static void main (String args[])
   {
      Student pupil = new Student();
      pupil.setIdNumber(234);
      pupil.setPoints(47);
      pupil.setHours(15);

      pupil.showIdNumber();
      pupil.showPoints();
      pupil.showHours();
      System.out.println("The grade point average is " +
         pupil.getGradePoint());
   }
}


