package arrays;

public class RemoveElement {

    public static int[] removeElement(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }
        if (count == 0) {
            return array;
        }
        int[] newArray = new int[array.length - count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5};
        int target = 3;
        int[] newArray = removeElement(array, target);
        System.out.print("Original array: ");
        printArray(array);
        System.out.print("New array after removing " + target + ": ");
        printArray(newArray);
    }
}