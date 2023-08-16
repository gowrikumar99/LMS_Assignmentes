/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r,c;
    System.out.println("enter the number of rows");
    r=sc.nextInt();
    System.out.println("enter the number of coloumns");
    c=sc.nextInt();
    int arr[][]=new int[r][c];
    int trans_arr[][]=new int[c][r];
    for(int i=0;i<arr.length;i++)
      for(int j=0;j<arr.length;j++)
        arr[i][j]=sc.nextInt();
    System.out.println("after transpose matrix");
    for(int i=0;i<trans_arr.length;i++)
      for(int j=0;j<trans_arr[i].length;j++)
        trans_arr[i][j]=arr[j][i];
    for(int i=0;i<trans_arr.length;i++){
      for(int j=0;j<trans_arr[i].length;j++)
        System.out.print(+trans_arr[i][j]+"\t\t");
    System.out.println();
    }
    }
  }

//Define the main method

//Declare the variables

//Take input from user to enter rows and column values

//Convert the square matrix into transpose

//Print the transpose matrix

//printing j and i instead of i and j

//Good
