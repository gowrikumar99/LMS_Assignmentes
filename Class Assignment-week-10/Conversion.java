
/*

Set Conversion:
Create an ArrayList of integers.
Convert the ArrayList to a HashSet to remove duplicates.
Convert the HashSet back to an ArrayList.

*/
import java.util.*;

class Conversion {
  public static void main(String args[]) {
//1.Create an ArrayList of integers.
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(2); // duplicate element

    System.out.println(list);

//2.Convert the ArrayList to a HashSet to remove duplicates
    HashSet<Integer> set = new HashSet<Integer>(list);

    System.out.println(set);
//3. Convert the HashSet back to an ArrayList
    ArrayList<Integer> newList = new ArrayList<Integer>(set);

    // Print the newList
    System.out.println(newList);

  }
}