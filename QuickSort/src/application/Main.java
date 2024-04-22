package application;

import entities.QuickSort;

public class Main {

	public static void main(String[] args) {
		int[] array = { 10, 7, 8, 9, 1, 5 };
		QuickSort quickSort = new QuickSort(array);
		quickSort.order();
		quickSort.printArray();
	}
}
