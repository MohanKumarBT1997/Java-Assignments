package arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] array) {
        int[] temp = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = array[i];
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 9};
        int[] result = removeDuplicates(array);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
