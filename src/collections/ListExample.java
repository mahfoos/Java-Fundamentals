package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    // List is an interface that extends Collection. It is an ordered collection (also known as a sequence).
    // Elements can be inserted or accessed by their position in the list, using a zero-based index.
    // A list may contain duplicate elements.

    // List implementations:
    // 1. ArrayList: Resizable-array implementation of the List interface.
    // 2. LinkedList: Doubly-linked list implementation of the List and Deque interfaces.
    // 3. Vector: Synchronized resizable-array implementation of the List interface.
    // 4. Stack: Subclass of Vector.

    // List methods:
    // 1. void add(int index, E element): Inserts the specified element at the specified position in this list.
    // 2. boolean addAll(int index, Collection<? extends E> c): Inserts all of the elements in the specified collection into this list at the specified position.
    // 3. E get(int index): Returns the element at the specified position in this list.
    // 4. int indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    // 5. int lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
    // 6. E remove(int index): Removes the element at the specified position in this list.
    // 7. E set(int index, E element): Replaces the element at the specified position in this list with the specified element.
    // 8. List<E> subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

    // List example:

    public static void main(String[] args) {

        // Creating a list
        List<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");
        list.add("C#");
        list.add("Ruby");
        list.add("PHP");

        // Accessing elements from the list
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));

        // Iterating over the list
        System.out.println("Elements in the list:");
        for (String element : list) {
            System.out.println(element);
        }

        // Removing elements from the list
        list.remove(0);
        list.remove("Python");

        // Iterating over the list after removing elements
        System.out.println("Elements in the list after removing elements:");
        for (String element : list) {
            System.out.println(element);
        }

        // Checking if the list contains an element
        System.out.println("Is 'Java' present in the list? " + list.contains("Java"));

        // Checking the index of an element
        System.out.println("Index of 'JavaScript' in the list: " + list.indexOf("JavaScript"));

        // Checking the last index of an element
        System.out.println("Last index of 'JavaScript' in the list: " + list.lastIndexOf("JavaScript"));

        // Checking if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());

        // Getting the size of the list
        System.out.println("Size of the list: " + list.size());

        // Clearing the list
        list.clear();

        // Checking if the list is empty after clearing
        System.out.println("Is the list empty after clearing? " + list.isEmpty());


    }
}
