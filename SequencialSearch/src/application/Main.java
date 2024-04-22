package application;

import entities.SequencialSearch;

public class Main {

	public static void main(String[] args) {
		int[] array = { 2, 5, 8, 4, 1 };

		SequencialSearch sequencialSearch = new SequencialSearch(array);

		sequencialSearch.search(8);
		sequencialSearch.printArray();
	}
}
