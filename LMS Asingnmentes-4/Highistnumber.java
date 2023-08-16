/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
     
//Add main method

//Declare the three variables

//Use the scanner class to provide input at execution time
/* 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();
 
*/

//check which number is highest using if else condition

//Print the highest of three numbers
 

import java.util.Scanner;
class Highistnumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number : ");
      int num1=sc.nextInt();
    System.out.println("Enter second number : ");
      int num2=sc.nextInt();
    System.out.println("Enter third number : ");
      int num3=sc.nextInt();
    if(num1>num2 && num1>num3){
      System.out.println(num1);
    }
      else if(num2>num3){
      System.out.println(num2);
      }else{
      System.out.println(num3);
      }
    }
  }


