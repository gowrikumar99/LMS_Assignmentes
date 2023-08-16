//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Unicode {
  public static void main(String[] args){
    char ch;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Alphabet between the A-B");
    ch=sc.next().charAt(0);
    int asciiValue=ch;
    System.out.println("ASCII value of"+ch+" is:"+asciiValue);
  }

//Define main method

//Use the scanner class to provide character at execution time
/*Scanner scanner = new Scanner(System.in);  
char character = scanner.next().charAt(0);  
int asciiValue = character; 
*/

//Print the Result

}