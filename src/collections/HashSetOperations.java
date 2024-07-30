package collections;

import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements of type String
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Elderberry");
        stringSet.add("Fig");
        stringSet.add("Grape");
        stringSet.add("Honeydew");
        stringSet.add("Ice Cream");
        stringSet.add("Jackfruit");
        stringSet.add("Kiwi");

        System.out.println("Initial HashSet: " + stringSet);

        stringSet.add("Lemon");
        System.out.println("After adding Lemon: " + stringSet);

        boolean isPresent = stringSet.contains("Grape");
        System.out.println("Is 'Grape' present in the set? " + isPresent);

        stringSet.remove("Fig");
        System.out.println("After removing Fig: " + stringSet);

        boolean isEmpty = stringSet.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        int size = stringSet.size();
        System.out.println("Size of the set: " + size);

        System.out.print("Elements of the set: ");
        for (String element : stringSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Apple");
        anotherSet.add("Banana");
        anotherSet.add("Cherry");
        boolean containsAll = stringSet.containsAll(anotherSet);
        System.out.println("Does the set contain all elements of another set? " + containsAll);

        stringSet.clear();
        System.out.println("After clearing the set: " + stringSet);

        isEmpty = stringSet.isEmpty();
        System.out.println("Is the set empty after clearing? " + isEmpty);
    }
}
