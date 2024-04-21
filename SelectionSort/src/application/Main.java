package application;

import entities.SelectionSort;

public class Main {

	public static void main(String[] args) {
		int[] array = { 5, 2, 3, 1, 4 };

		SelectionSort selectionSort = new SelectionSort(array);

		selectionSort.order();
		selectionSort.printSelectionSort();

	}

}
