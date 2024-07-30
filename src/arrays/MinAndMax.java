package arrays;

public class MinAndMax {

    public static void findMinMax(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 3};
        findMinMax(array);
    }
}