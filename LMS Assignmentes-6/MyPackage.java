/*  JFM1T6_Assignment5:
    Write a class "MyClass" in package "mypack" and access it from other class outside the package "mypack".

    Sample Output:
    Welcome to Packages


//create a package name mypack, inside a folder called mypack, and create a class MyClas. In that create Display method and  print message

//outside folder  import the mypack  and call Dislay method 
import java.util.Scanner;
pubic class MyPackage{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username");
    String PackageName = sc.nextLine();
    System.out.println("Username is: " + userName);
  }
}
*/
import package.name.*;
class MyPackage{
  void display(){
    System.out.println("Welcome to packages");
  }
}
  class MyPackage{ 
  public static void main(String args[]){
    Main1 sc = new Main1();
    sc.display();
  }
}