package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");
        arrayList.add("Fig");
        arrayList.add("Grape");
        arrayList.add("Honeydew");
        arrayList.add("Ice Cream");
        arrayList.add("Jackfruit");

        System.out.println("Initial ArrayList: " + arrayList);

        // Add an element to the ArrayList
        arrayList.add("Kiwi");
        System.out.println("After adding Kiwi: " + arrayList);

        // Iterate through the ArrayList using Iterator object
        Iterator<String> iterator = arrayList.iterator();
        System.out.print("Iterating through ArrayList: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Add an element at a specific index
        arrayList.add(5, "Lemon");
        System.out.println("After adding Lemon at index 5: " + arrayList);

        // Remove an element from the ArrayList
        arrayList.remove("Grape");
        System.out.println("After removing Grape: " + arrayList);

        // Remove an element at an index
        arrayList.remove(7);
        System.out.println("After removing element at index 7: " + arrayList);

        // Update the element at a specific index
        arrayList.set(3, "Dragon Fruit");
        System.out.println("After updating element at index 3: " + arrayList);

        // Check the element is present at a particular index
        System.out.println("Is 'Elderberry' present at index 4? " + (arrayList.get(4).equals("Elderberry") ? "Yes" : "No"));

        // Get an element at a particular index
        System.out.println("Element at index 2: " + arrayList.get(2));

        // Find out the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Check the given element is present in the ArrayList
        System.out.println("Is 'Jackfruit' present in ArrayList? " + (arrayList.contains("Jackfruit") ? "Yes" : "No"));

        // Remove all elements of the ArrayList
        arrayList.clear();
        System.out.println("After clearing ArrayList: " + arrayList);
    }
}
