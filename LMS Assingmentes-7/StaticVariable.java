/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/

//main method

//initializing Student class constructor by 3 times and passing 3 student names

//displaying student name and roll number

//declare Student class andd add declare name, rollno(static)

//add getters and setterss

class StaticVariable1 {
  String name;
  static int rollno = 1;
  int rol_no;

  Statics(String name) {
    this.rol_no = rollno++;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRol_no() {
    return rol_no;
  }

  public void setRol_no(int rol_no) {
    this.rol_no = rol_no;
  }

  public void variables() {
    System.out.println("Roll no is :" + getRol_no() +" "+"Name :" + name);
  }
}

class StaticVariables {
  public static void main(String args[]) {
    Statics s1 = new Statics("Gowri");
    Statics s2 = new Statics("Kumar");
    Statics s3 = new Statics("Pavan");
    s1.variables();
    s2.variables();
    s3.variables();
  }
}
