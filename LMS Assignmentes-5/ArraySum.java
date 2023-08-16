/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/


import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Declare an array of size 10
        int[] numbers = new int[10];

        // Declare a variable to store the sum
        int sum = 0;

        // Prompt the user for 10 numbers and store them in the array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // Loop through the array and add each element to the sum
        for (int num : numbers) {
            sum += num;
        }

        // Display the sum of all the elements
        System.out.println("The sum of all the elements is: " + sum);
    }
}
