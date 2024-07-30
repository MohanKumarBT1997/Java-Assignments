package arrays;

public class ArrayContainsElements {
    public static boolean containsElements(int[] array, int elem1, int elem2) {
        boolean foundElem1 = false;
        boolean foundElem2 = false;

        for (int num : array) {
            if (num == elem1) {
                foundElem1 = true;
            }
            if (num == elem2) {
                foundElem2 = true;
            }
            if (foundElem1 && foundElem2) {
                break;
            }
        }

        return foundElem1 && foundElem2;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 12, 5, 6, 23, 7, 8, 9, 10 };
        int elem1 = 12;
        int elem2 = 23;

        boolean result = containsElements(array, elem1, elem2);

        System.out.println("Array contains " + elem1 + " and " + elem2 + ": " + result);
    }
}
