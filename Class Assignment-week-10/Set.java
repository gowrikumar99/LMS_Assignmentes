/*


Basic Set Operations:
Create a HashSet and add the following elements to it: "apple," "banana," "cherry," "date," "fig."
Print the elements in the set.
Check if the set contains "banana."
Remove "cherry" from the set.
Print the size of the set.

  */
import java.util.*;
 class Set{
    public static void main(String args[]){
       
       HashSet<String> hs=new HashSet<String>();
        hs.add("apple");
        hs.add("banana");
        hs.add("cherry");
        hs.add("date");
        hs.add("fig");
        System.out.println(hs); // apple, banana,cherry,date,fig
        System.out.println(hs.contains("banana")); // true
        System.out.println(hs.remove("cherry"));
        System.out.println(hs);// apple,banana,date,fig
        System.out.println(hs.size());// 4
  
    }
 }