/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/

import java.util.Scanner;

public class IntToString {

//main method
public static void main(String args[]){
  
Scanner sc =new Scanner(System.in);
//declare int type variable
System.out.println("Enter the Integer value");
  lnt a = sc.nextInt();
  System.out.println("Enter the indix position to print");
  int b=nextInt();
  String c=String.valueOf(a);
  System.out.println("Converting to string :"+c);
  System.out.println("char at given index is :"+(c.charAt(3)));
//take input from user

//converting integer to string using toString method

//use inbuilt function to print index position

//print result
}
}
