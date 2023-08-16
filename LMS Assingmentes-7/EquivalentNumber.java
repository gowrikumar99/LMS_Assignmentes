/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   
*/



//Main method

//initialize Convert class constructor

//create Scanner object

//take input from user

//convert numbers into hexa,octal and binary

//print result
     


//create Convert class in that declare variables

//add getters and setters method

import java.util.*;
 class EquivalentNumbers 
{
   int num;
    void getVal()
     {
         System.out.println("Decimal to HexaDecimal,Octal and Binary");
          Scanner scan = new Scanner(System.in);
          System.out.println("\nEnter the number :");
          num = Integer.parseInt(scan.nextLine());
     }
    void convert()
      {
           String hexa = Integer.toHexString(num);
           System.out.println("HexaDecimal Value is : " + hexa);
           String octal = Integer.toOctalString(num);
           System.out.println("Octal Value is : " + octal);
           String binary = Integer.toBinaryString(num);
           System.out.println("Binary Value is : " + binary);
       }
}
class Decimal_Conversion
{
   public static void main(String args[])
    {
        EquivalentNumbers  obj = new EquivalentNumbers ();
         obj.getVal();
         obj.convert();
    }
}