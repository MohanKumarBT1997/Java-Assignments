package arrays;

public class Duplicates {

    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate value: " + array[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 9};
        findDuplicates(array);
    }
}