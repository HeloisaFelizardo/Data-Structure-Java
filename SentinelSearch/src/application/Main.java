package application;

import entities.SentinelSearch;

public class Main {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int x = 3;

		SentinelSearch sentinelSearch = new SentinelSearch(array);
		sentinelSearch.search(x);
		sentinelSearch.printArray();
	}
}
