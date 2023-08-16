/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/



//main method

//initialize Student class using constructor

//Get student name and rollno from user and set it to the Student object  

//print result

}

//Create Student class in that declare variables name and roll number 

//add  setter method for rollno



//add getter method for rollno



//add setters and getters for name fields also
import java.util.Scanner;

 class Student {

   String name;
   int rollno;

Student( String name,int rollno)
   {
     this.name=name;
     this.rollno=rollno;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
}
class StudentConstructor
  {
    public static void main(String args[])
    {
      Student s1=new Student("Gowri",1);
      Student s2=new Student("Kumar",2);
      Student s3=new Student("Pavan",3);
       System.out.println("Name :"+s1.getName()+" "+"Roll no:"+s1.getRollno());
      System.out.println("Name :"+s2.getName()+" "+"Roll no:"+s2.getRollno());
      System.out.println("Name :"+s3.getName()+" "+"Roll no:"+s3.getRollno());
    }
  }

