package arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13,
        		14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
        		27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
        		41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 52, 53, 54, 55,
        		56, 57, 58, 59, 60, 61, 62, 64, 65, 66, 67, 68, 69, 70, 
        	    72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 
        		87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        int[] missingNumbers = findMissingNumbers(array);
        System.out.print("The missing numbers are: ");
        for (int num : missingNumbers) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static int[] findMissingNumbers(int[] array) {
        int[] missingNumbers = new int[100];
        int missingIndex = 0;
        int expectedNum = 1;
        for (int num : array) {
            while (num > expectedNum) {
                missingNumbers[missingIndex++] = expectedNum;
                expectedNum++;
            }
            expectedNum++;
        }
        while (expectedNum <= 100) {
            missingNumbers[missingIndex++] = expectedNum;
            expectedNum++;
        }
        return missingNumbers;
    }
}
