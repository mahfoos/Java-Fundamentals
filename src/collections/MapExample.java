package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    // Map is an interface in Java
    // It is used to store key-value pairs
    // It is not a part of the Collection framework
    // It is a part of the Java Util package
    // It is an interface that is implemented by classes like HashMap, TreeMap, LinkedHashMap, etc.
    // It is not a subtype of the Collection interface

    // HashMap is a class in Java
    // It is used to store key-value pairs
    // It is a part of the Java Util package
    // It is a part of the Collection framework
    // It is a subtype of the Map interface
    // It does not maintain any order

    // TreeMap is a class in Java
    // It is used to store key-value pairs
    // It is a part of the Java Util package
    // It is a part of the Collection framework
    // It is a subtype of the Map interface
    // It maintains the natural order of the keys

    // LinkedHashMap is a class in Java
    // It is used to store key-value pairs
    // It is a part of the Java Util package
    // It is a part of the Collection framework
    // It is a subtype of the Map interface
    // It maintains the order of insertion

    // HashMap Example


    public static void main(String[] args) {

        // Creating a map
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "JavaScript");
        map.put(4, "C++");
        map.put(5, "C#");
        map.put(6, "Ruby");
        map.put(7, "PHP");

        // Accessing elements from the map
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 2: " + map.get(2));

        // Iterating over the map
        System.out.println("Key-value pairs in the map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing elements from the map
        map.remove(1);
        map.remove(2);

        // Iterating over the map after removing elements
        System.out.println("Key-value pairs in the map after removing elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
