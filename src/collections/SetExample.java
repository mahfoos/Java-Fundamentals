package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    // Set is a collection that does not allow duplicate elements.
    // HashSet is a class that implements Set interface.
    // HashSet does not maintain the order of elements.
    // HashSet does not allow duplicate elements.
    // HashSet allows null elements.
    // HashSet is not synchronized.
    // HashSet is not thread-safe.
    // HashSet is faster than TreeSet.
    // HashSet is slower than LinkedHashSet.
    // HashSet is not sorted.
    // HashSet is not ordered.
    // HashSet is not a part of the Collection framework.
    // HashSet is a part of the Java Util package.
    // HashSet is a subtype of the Set interface.
    // HashSet is implemented using a hash table.
    // HashSet uses the hashCode() method to store elements.
    // HashSet uses the equals() method to check for duplicate elements.
    // HashSet has constant time complexity for add, remove, contains, and size operations.


    // HashSet Example

    public static void main(String[] args) {

        // Creating a set
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Java");
        set.add("Python");
        set.add("JavaScript");
        set.add("C++");
        set.add("C#");
        set.add("Ruby");
        set.add("PHP");

        // Accessing elements from the set
        System.out.println("Elements in the set:");
        for (String element : set) {
            System.out.println(element);
        }

        // Removing elements from the set
        set.remove("Java");
        set.remove("Python");

        // Accessing elements from the set after removing elements
        System.out.println("Elements in the set after removing elements:");
        for (String element : set) {
            System.out.println(element);
        }

    }
}
