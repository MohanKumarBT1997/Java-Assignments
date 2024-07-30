package arrays;

public class FindElement {

    public static boolean contains(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        if (contains(array, target)) {
            System.out.println("Array contains " + target);
        } else {
            System.out.println("Array does not contain " + target);
        }
    }
}