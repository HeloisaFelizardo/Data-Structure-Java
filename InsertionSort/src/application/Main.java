package application;

import entities.InsertionSort;

public class Main {

	public static void main(String[] args) {
		int[] array = { 5, 2, 3, 1, 4 };

		InsertionSort insertionSort = new InsertionSort(array);

		insertionSort.order();
		insertionSort.printInsertionSort();
	}
}
