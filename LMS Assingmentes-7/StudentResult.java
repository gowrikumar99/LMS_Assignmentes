/* JFM1T7_Assignment2:

   Create a Student Result Processing System for 3 students.
   
   Sample inputs: Console input roll numbers, names and 5 subject marks for each student
   
   Sample output: Display roll numbers, names and percentage obtained by all 3 students in the following format:
   Roll Number: 1
   Name: Shree Balaji
   Percentage: 99%

*/


//main method

//initialize student constructor 3 times with different names

//Create an array and add the 3 student to it

//create displayPercentage static method in that add a for loop for student array

//calculate percentage

//display student details

//create getStudentInput method in that create a Scanner object and take input from user

//print 5 subject marks using for loop
     


//create Student class 


//declare and initialize variables

//add getters and setters method

import java.io.*;
class parameterizedConstructor {
  
    // fields of the class
    String name;
    int regestrationNumber;
  
    // creating a parameterized constructor so that we can
    // initialize the value of the class
    parameterizedConstructor(String name,
                             int regestrationNumber)
    {
        System.out.println("constructor call");
        this.name = name;
        this.regestrationNumber = regestrationNumber;
    }
}
  
class StudentResult{
    public static void main(String[] args)
    {
        // creating our first object
        parameterizedConstructor obj1
            = new parameterizedConstructor("Gowri",
                                           2021806);
        System.out.println("Name of the student "
                           + obj1.name);
        System.out.println("Registration Number "
                           + obj1.regestrationNumber);
  
        // creating second object
        parameterizedConstructor obj2
            = new parameterizedConstructor("Kumar",
                                           2021807);
        System.out.println("Name of the student "
                           + obj2.name);
        System.out.println("Registration Number "
                           + obj2.regestrationNumber);
    }
}