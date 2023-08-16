
//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/


//Define main method

//Declare a variable and initialize it as true or false 

//Print the Result using not operator 


import java.util.Scanner;
public class BooleanOperator{
  public static void main(String[] args){    //Define main method
    boolean value;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the boolean value");
    value=sc.nextBoolean();  //Declare a variable and initialize it as true or false 
    if(value==true){
      System.out.println("false");
    }
    else{
      System.out.println("true");//Print the Result using not operator 
    }
  }
}