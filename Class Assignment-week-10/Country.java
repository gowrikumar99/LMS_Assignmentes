/* 

Set Iteration:
Create a HashSet of country names.
Use an iterator to loop through the set and print each country name.
Modify the loop to print the countries in reverse order.

*/
import java.util.*;

class Country{
  public static void main(String args[]) {

    // Create a HashSet of country names
    HashSet<String> countries = new HashSet<String>();
    countries.add("India");
    countries.add("Japan");
    countries.add("USA");
    countries.add("UK");
    countries.add("France");

    // Use an iterator to loop through the set and print each country name
    Iterator<String> itr = countries.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    // Modify the loop to print the countries in reverse order
    ArrayList<String> list = new ArrayList<String>(countries);
    Collections.reverse(list);
    itr = list.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

  }
}
