package arrays;

public class CopyArray {

    public static void copyArray(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[source.length];
        copyArray(source, destination);
        System.out.print("Source array: ");
        printArray(source);
        System.out.print("Destination array: ");
        printArray(destination);
    }
}
