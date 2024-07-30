package arrays;

public class ElementInsert {

	public static int[] insertElement(int[] array, int index, int element) {
		if (index < 0 || index > array.length) {
			System.out.println("Index out of bounds");
			return array;
		}
		int[] newArray = new int[array.length + 1];
		for (int i = 0; i < index; i++) {
			newArray[i] = array[i];
		}
		newArray[index] = element;
		for (int i = index; i < array.length; i++) {
			newArray[i + 1] = array[i];
		}
		return newArray;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int index = 2;
		int element = 10;
		int[] newArray = insertElement(array, index, element);
		System.out.print("Original array: ");
		printArray(array);
		System.out.print("New array after inserting " + element + " at index " + index + ": ");
		printArray(newArray);
	}
}
