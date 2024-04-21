/*
 * InsertionSort (V)
1. para j <- 1 até |V| - 1
2.    chave <- V[j]
3.    i <- j - 1
4.    enquanto i >= 0 e V[i] > chave
5.       V[i + 1] <- V[i]
6.       i <- i - 1
7.    V[i + 1] <- chave
 */

package entities;

public class InsertionSort {
	private int[] array;
	int key;
	int i;
	
	public InsertionSort( int[] array) {
		this.array = array;
		key = 0;
		i = 0;
	}
	
	public void order() {
		int n = array.length;
		for(int j = 1; j < n; j++) {
			key = array[j];
			i = j -1;
			while(i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}
	
	public void printInsertionSort() {
		for(int element : array) {
			System.out.print(element + " ");
		}
	}
}
