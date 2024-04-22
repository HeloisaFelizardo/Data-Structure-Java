/*
 Busca (x, V)
1.  para i <- 0 ate |V|
2.       se x = V[i]
3.			 retorna VERDADEIRO
4. 	retorna FALSO
 */

package entities;

public class SequencialSearch {
	private int[] array;

	public SequencialSearch(int[] array) {
		this.array = array;
	}

	public boolean search(int x) {
		for (int i = 0; i < array.length; i++) {
			if (x == array[i]) {
				System.out.println("Número " + x + " encontrado na posição " + i + " do array.");
				return true;
			}
		}
		System.out.println("Número " + x + " não encontrado na array.");
		return false;
	}

	public void printArray() {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
}
