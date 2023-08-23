/*Removing Duplicates:
Given an array of integers, write a Java program to convert it into a Set to remove duplicates.
Convert the Set back to an array and print the unique values.
 */
// import the required classes
import java.util.*;
import java.util.ArrayList;

public class RemovingDuplicates {

  public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 4, 5, 6, 6};
    
    // convert the array to a list
    List<Integer> list = Arrays.asList(array);
    
    // create a set from the list
    HashSet<Integer> set = new HashSet<>(list);
    
    // convert the set back to an array
    Integer[] uniqueArray = set.toArray(new Integer[set.size()]);
    
    // print the unique values
    System.out.println("Unique values: " + Arrays.toString(uniqueArray));
  }
}
