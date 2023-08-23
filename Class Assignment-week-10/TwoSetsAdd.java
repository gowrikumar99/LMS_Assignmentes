/*
Set Operations:
Create two sets: set1 and set2, and add some elements to each.
Find and print the union of the two sets.
Find and print the intersection of the two sets.
Find and print the elements that are unique to each set (i.e., not in the other set).

*/


import java.util.*;

public class TwoSetsAdd {

    public static void main(String[] args) {
        // Create two sets: set1 and set2
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // Add some elements to each set
        set1.add("gowrikumar");
        set1.add("java");
        set1.add("bitlabs");
        set2.add("pavankalyan");
        set2.add("bitlabs");
        set2.add("dukka");

        // Find and print the union of the two sets
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Find and print the intersection of the two sets
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Find and print the elements that are unique to each set
        HashSet<String> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Elements in set1 but not in set2: " + difference1);

        HashSet<String> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Elements in set2 but not in set1: " + difference2);
    }
}
