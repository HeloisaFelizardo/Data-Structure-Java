package application;

import entities.BubbleSort;

public class Main {

	public static void main(String[] args) {
		int[] array = { 3, 5, 1, 8, 4, 0 };

		BubbleSort bubbleSort = new BubbleSort(array);
		bubbleSort.order();
		bubbleSort.printBubbleSort();
	}
}
