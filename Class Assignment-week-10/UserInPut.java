/*
Set Operations with User Input:
Write a program that allows a user to input a list of numbers.
Create a HashSet to store the unique numbers.
Ask the user if they want to add more numbers or perform operations like checking for containment or finding the size of the set.
*/
import java.util.HashSet;
import java.util.Scanner;

public class UserInPut {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the numbers : ");
        //int num=sc.nextInt();

        // Create a HashSet to store the unique numbers
        HashSet<Integer> set = new HashSet<>();

        // A boolean variable to control the loop
        boolean done = false;

        // A loop to ask the user for numbers and operations
        while (!done) {
            // Ask the user what they want to do
            System.out.println("What do you want to do?");
            System.out.println("1. Add a number to the set");
            System.out.println("2. Check if a number is in the set");
            System.out.println("3. Find the size of the set");
            System.out.println("4. Exit the program");

            // Read the user's choice
            int choice = sc.nextInt();

            // Perform the corresponding action
            switch (choice) {
                case 1:
                    // Ask the user for a number
                    System.out.println("Enter a number:");
                    int num = sc.nextInt();

                    // Add the number to the set
                    set.add(num);

                    // Print a confirmation message
                    System.out.println("The number " + num + " has been added to the set.");
                    break;
                case 2:
                    // Ask the user for a number
                    System.out.println("Enter a number:");
                    num = sc.nextInt();

                    // Check if the number is in the set
                    boolean contains = set.contains(num);

                    // Print the result
                    if (contains) {
                        System.out.println("The number " + num + " is in the set.");
                    } else {
                        System.out.println("The number " + num + " is not in the set.");
                    }
                    break;
                case 3:
                    // Find the size of the set
                    int size = set.size();

                    // Print the result
                    System.out.println("The size of the set is " + size + ".");
                    break;
                case 4:
                    // Exit the program
                    done = true;
                    break;
                default:
                    // Invalid choice
                    System.out.println("Please enter a valid option.");
            }
        }

        // Close the Scanner object
        sc.close();
    }
}
