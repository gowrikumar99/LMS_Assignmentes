/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
      




// Create a member variable for Sport name 

// Set member variable for Sport name 




// Create object for Sport class 

// Print the value of Sport name using "this" reference



class  Sport { 

// Create a member variable for Sport name 
  String name;
// Set member variable for Sport name 
  Sport(String name)
  {
    this.name=name;
  }
  void display()
  {
    System.out.println("Sport name: "+name);
  }
public static void main(String args[]) { 

// Create object for Sport class 
  Sport s=new Sport("foot ball");
// Print the value of Sport name using "this" reference
  s.display();
} 

} 