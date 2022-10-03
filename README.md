# Unit-3-Using-Methods-Classes-and-Objects
Exercises 3-4 - 3-13

Look at you, college student cheating :~)

SlayTeam 2023

Exercise Instructions
-----------------------------
3-4 A-B
--
A. Create an application named NumbersDemo whose main() method holds two integer variables. Assign values to the variables. In turn, pass each value to methods named displayTwiceTheNumber(), displayNumberPlusFive(), and displayNumberSquared(). Create each method to perform the task its name implies. Save the application as NumbersDemo.java.

B. Modify the NumbersDemo class to accept the values of the two integers from a user at the keyboard. Save the file as NumbersDemo2.java.

3-5 A-B
--
A. Create an application named Percentages whose main() method holds two double variables. Assign values to the variables. Pass both variables to a method named computePercent() that displays the two values and the value of the first number as a percentage of the second one. For example, if the numbers are 2.0 and 5.0, the method should display a statement similar to “2.0 is 40 percent of 5.0.” Then call the method a second time, passing the values in reverse order. Save the application as Percentages.java.

B. Modify the Percentages class to accept the values of the two doubles from a user at the keyboard. Save the file as Percentages2.java.

3-6
--
To encourage good grades, Hermosa High School has decided to award each student a bookstore credit that is 10 times the student’s grade point average. In other words, a student with a 3.2 grade point average receives a $32 credit. Create a class that prompts a student for a name and grade point average, and then passes the values to a method that displays a descriptive message. The message uses the student’s name, echoes the grade point average, and computes and displays the credit. Save the application as BookstoreCredit.java.

3-7
--
There are 12 inches in a foot and 3 feet in a yard. Create a class named InchConversion. Its main() method accepts a value in inches from a user at the keyboard, and in turn passes the entered value to two methods. One converts the value from inches to feet, and the other converts the same value from inches to yards. Each method displays the results with appropriate explanation. Save the application as InchConversion.java.

3-8
--
Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main() method that prompts the user for the length, width, and height of a rectangular room. Pass these three values to a method that does the following:

 - Calculates the wall area for a room

 - Passes the calculated wall area to another method that calculates and returns the number of gallons of paint needed

 - Displays the number of gallons needed

 - Computes the price based on a paint price of $32 per gallon, assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon

 - Returns the price to the main() method

The main() method displays the final price. For example, the cost to paint a 15-by-20-foot room with 10-foot ceilings is $64. Save the application as PaintCalculator.java.

3-9
--
The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year. The premium is computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20. For example, a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15, and then multiplying by 20. Write an application that prompts a user for the current year and a birth year. Pass both to a method that calculates and returns the premium amount, and then display the returned amount. Save the application as Insurance.java.

3-10
--
Herbert’s Home Repair estimates each job cost as the cost of materials plus $35 per hour while on the job, plus $12 per hour for travel time to the job site. Create a class that contains a main() method that prompts the user for the name of a job (for example, Smith bathroom remodel), the cost of materials, the number of hours of work required, and the number of hours travel time. Pass the numeric data to a method that computes estimate for the job and returns the computed value to the main() method where the job name and estimated price are displayed. Save the program as JobPricing.java.

3-11
--
Create a class named Sandwich. Data fields include a String for the main ingredient (such as tuna), a String for bread type (such as wheat), and a double for price (such as 4.99). Include methods to get and set values for each of these fields. Save the class as Sandwich.java.

Create an application named TestSandwich that instantiates one Sandwich object and demonstrates the use of the set and get methods. Save this application as TestSandwich.java.

3-12
--
Create a class named Student that has fields for an ID number, number of credit hours earned, and number of points earned. (For example, many schools compute grade point averages based on a scale of 4, so a three-credit-hour class in which a student earns an A is worth 12 points.) Include methods to assign values to all fields. A Student also has a field for grade point average. Include a method to compute the grade point average field by dividing points by credit hours earned. Write methods to display the values in each Student field. Save this class as Student.java.

Write a class named ShowStudent that instantiates a Student object from the class you created and assign values to its fields. Compute the Student grade point average, and then display all the values associated with the Student. Save the application as ShowStudent.java.

Create a constructor for the Student class you created. The constructor should initialize each Student’s ID number to 9999, his or her points earned to 12, and credit hours to 3 (resulting in a grade point average of 4.0). Write a program that demonstrates that the constructor works by instantiating an object and displaying the initial values. Save the application as ShowStudent2.java.

3-13
--
Create a class named Lease with fields that hold an apartment tenant’s name, apartment number, monthly rent amount, and term of the lease in months. Include a constructor that initializes the name to “XXX”, the apartment number to 0, the rent to 1000, and the term to 12. Also include methods to get and set each of the fields. Include a nonstatic method named addPetFee() that adds $10 to the monthly rent value and calls a static method named explainPetPolicy() that explains the pet fee. Save the class as Lease.java.

Create a class named TestLease whose main() method declares four Lease objects. Call a getData() method three times. Within the method, prompt a user for values for each field for a Lease, and return a Lease object to the main() method where it is assigned to one of main()’s Lease objects. Do not prompt the user for values for the fourth Lease object, but let it continue to hold the default values. Then, in main(), pass one of the Lease objects to a showValues() method that displays the data. Then call the addPetFee() method using the passed Lease object and confirm that the fee explanation statement is displayed. Next, call the showValues() method for the Lease object again and confirm that the pet fee has been added to the rent. Finally, call the showValues() method with each of the other three objects; confirm that two hold the values you supplied as input and one holds the constructor default values. Save the application as TestLease.java.
