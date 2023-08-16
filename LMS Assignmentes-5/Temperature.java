/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/



//Define the main method

//Declare the variables and initialize

//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result


import java.util.Scanner;

public class Temperature{
  
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of days");
    int n=sc.nextInt();
    
    double temp[]=new double[n];
    System.out.println("enter the temperatures of 7 days");
    
    for(int i=0;i<temp.length;i++)
      temp[i]=sc.nextDouble();
    double low_temp=temp[0];
    
    for(int j=0;j<temp.length;j++){
      if(low_temp>temp[j])
        low_temp=temp[j];
    }
    
    System.out.println("the lowest temperature of the week is "+low_temp);
    
  }
}