/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/


//main method

//initialize Student class constructor for three times

//Create an array and add the 3 student to it

//take input from user 3 times using for loop 

//creating Student class and declaring variables

//creating staticBlock in that give collegename

//add getters and setters

//creating dispCollegename static method 
     
import java.util.*;
class Static {

String name;
   int rollno;
  static String clg;
   Static(String name, int rollno)
  {
    this.name=name;
    this.rollno=rollno;
  }
  static String dispCollegeName()
  {
     return clg="IIT";
     
  }
  public void student()
  {
    System.out.println("The student name is :"+name);
    System.out.println("The student roll no is :"+rollno);
     System.out.println("The college name is :"+dispCollegeName());
  }

  class StaticBlocks
    {
      public static void main(String ags[])
      {
        Static s1=new Static("Gowri",555);
        s1.student();
        Static s2=new Static("Kumar",786);
        s2.student();
        
      }
    }
}

