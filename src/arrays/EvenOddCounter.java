package arrays;

public class EvenOddCounter {
    public static int[] findEvenOddCount(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[] { evenCount, oddCount };
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = findEvenOddCount(numbers);

        System.out.println("Even count: " + result[0]);
        System.out.println("Odd count: " + result[1]);
    }
}
