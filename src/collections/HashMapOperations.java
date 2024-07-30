package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Krishna");
        studentMap.put(2, "Raj");
        studentMap.put(3, "Ram");
        studentMap.put(4, "Bheem");
        studentMap.put(5, "Arjun");
        studentMap.put(6, "Karna");
        studentMap.put(7, "Abhimanyu");
        studentMap.put(8, "Ashwatthama");
        studentMap.put(9, "Lakshman");
        studentMap.put(10, "Shakuni");

        System.out.println("Initial HashMap: " + studentMap);

        studentMap.put(11, "Balaram");
        System.out.println("After inserting new key-value pair: " + studentMap);

        // Fetch the value of a Key
        String studentName = studentMap.get(5);
        System.out.println("Student name for ID 5: " + studentName);

        // Create a clone/copy of HashMap
        HashMap<Integer, String> studentMapCopy = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("Cloned HashMap: " + studentMapCopy);

        // Check if the given Key is in the Map
        boolean isKeyPresent = studentMap.containsKey(7);
        System.out.println("Is key 7 present in the map? " + isKeyPresent);

        // Check if the value is in the Map
        boolean isValuePresent = studentMap.containsValue("Raavan");
        System.out.println("Is value 'Raavan' present in the map? " + isValuePresent);

        // Check if the map is empty
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // Print the size of the Map to the console
        System.out.println("Size of the map: " + studentMap.size());

        // Print all the Keys of the map to the console
        System.out.print("Keys of the map: ");
        for (Integer key : studentMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // Print all the Values of the map to the console
        System.out.print("Values of the map: ");
        for (String value : studentMap.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Remove a specific Key-value pair
        studentMap.remove(3);
        System.out.println("After removing key-value pair for ID 3: " + studentMap);

        // Copy all the elements of the Map to another Map
        HashMap<Integer, String> studentMapCopy2 = new HashMap<>(studentMap);
        System.out.println("Copied HashMap: " + studentMapCopy2);
    }
}
