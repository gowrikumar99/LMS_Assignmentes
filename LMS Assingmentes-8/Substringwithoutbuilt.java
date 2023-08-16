/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;

public class SubStringWithoutInbuilt {
public static void main(String args[]) {

String s="name is gowrikumar";
String st="gowri";
 String split[]=s.split(" ");
      for(int i=0;i<split.length;i++)
        {
          if(split[i]==st)
          {
            System.out.println("Is found");
          }
          else
          {
             System.out.println("Not found");
          }
        }

}
//main method

//declare variables

//take input from user

//compare two strings if the search string found or not without using inbuilt method isSubString()

//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false

}
