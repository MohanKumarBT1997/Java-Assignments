package arrays;

public class LargestSmallestDiff {
    public static int findLargestSmallestDiff(int[] numbers) {
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return largest - smallest;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 3, 5, 6, 2, 9, 1, 8, 4, 7 };
        int result = findLargestSmallestDiff(numbers);

        System.out.println("Difference of largest and smallest values: " + result);
    }
}