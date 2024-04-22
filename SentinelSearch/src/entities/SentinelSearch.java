/*
 * SentinelSearch(x, V)
 1. i <- 0
 2. V[|V| - 1] <- X
 3. enquanto x != V[i]
 4.     i <- i + 1
 5. se i = |V| - 1
 6.     retorna FALSO
 7. senão
 8. 	retorna VERDADEIRO
 */

package entities;

public class SentinelSearch {
	private int[] array;

	public SentinelSearch(int[] array) {
		this.array = array;
	}

	public boolean search(int x) {
		int i = 0;
		array[array.length - 1] = x;
		while (x != array[i]) {
			i++;
		}
		if (i == array.length - 1) {
			System.out.println("Número " + x + " não encontrado na array.");
			return false;
		} else {
			System.out.println("Número " + x + " encontrado na posição " + i + " do array.");
			return true;
		}
	}

	public void printArray() {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
}
