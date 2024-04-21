/*
 * SelectionSort (V)
1. para i <- 0 ate |V| - 1
2.    min <- i 
3.    para j <- i + 1 ate |V|
4.       se V[j] < V[min]
5. 			min <- j
6. 	  se i != min
7.       trocar V[i] com V[min]

 */

package entities;

public class SelectionSort {
	private int[] array;

	public SelectionSort(int[] array) {
		this.array = array;
	}

	public void order() {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if (min != i) {
				int troca = array[i];
				array[i] = array[min];
				array[min] = troca;
			}
		}
	}

	public void printSelectionSort() {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
}
