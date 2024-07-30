package arrays;

public class SecondLargest {

    public static int findSecondLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest number found");
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int secondLargest = findSecondLargest(array);
        System.out.println("Second largest number: " + secondLargest);
    }
}
