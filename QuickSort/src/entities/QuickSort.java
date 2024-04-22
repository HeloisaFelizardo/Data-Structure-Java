/*
Quicksort (V, p, r)
1. se p < q
2. 		q <- Partition(V, p, r)
3.      Quicksort (V, p, q - 1)
4.      Quicksort (V, q + 1, r)

p  = V[0]
r = |V| - 1

Partition(V, p, r)
1. x <- V[r]
2. i <- p -1
3. para j <- p ate r -1 
4. 		se V[j] <= x
5.      i <- i + 1
6.      trocar V[i] e V[j]
7. trocar V[i + 1] e V[r]
8. retornar i + 1;

O algoritmo que você forneceu tem alguns problemas. Aqui está a versão corrigida:

```java
package entities;

public class QuickSort {
	private int[] array;

	public QuickSort(int[] array) {
		this.array = array;
	}

	public void order() {
		quickSort(0, array.length - 1);
	}

	private void quickSort(int p, int r) {
		if (p < r) {
			int q = partition(p, r);
			quickSort(p, q - 1);
			quickSort(q + 1, r);
		}
	}

	private int partition(int p, int r) {
		int x = array[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (array[j] <= x) {
				i++;
				int troca = array[i];
				array[i] = array[j];
				array[j] = troca;
			}
		}
		int troca = array[i + 1];
		array[i + 1] = array[r];
		array[r] = troca;
		return i + 1;
	}
}
```

As correções são as seguintes:
1. Removi as variáveis `p`, `r` e `q` da classe, pois elas não são necessárias. 
As posições inicial e final do array a ser ordenado serão passadas como argumentos 
para o método `quickSort()`.
2. Adicionei um método `quickSort(int p, int r)` que implementa o algoritmo QuickSort. 
Ele verifica se `p` é menor que `r`, e se for, ele particiona o array e chama 
`quickSort()` recursivamente para as duas metades do array.
3. No método `partition()`, corrigi o loop `for`. Agora, ele verifica se `array[j]` 
é menor ou igual a `x`, e se for, ele incrementa `i` e troca `array[i]` com `array[j]`.
4. No método `order()`, chamei o método `quickSort()` com os argumentos apropriados 
para iniciar a ordenação.

 */

package entities;

public class QuickSort {
	private int[] array;

	public QuickSort(int[] array) {
		this.array = array;
	}

	public void order() {
		quickSort(0, array.length - 1);
	}

	private void quickSort(int p, int r) {
		if (p < r) {
			int q = partition(p, r);
			quickSort(p, q - 1);
			quickSort(q + 1, r);
		}
	}

	private int partition(int p, int r) {
		int x = array[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (array[j] <= x) {
				i++;
				int troca = array[i];
				array[i] = array[j];
				array[j] = troca;
			}
		}
		int troca = array[i + 1];
		array[i + 1] = array[r];
		array[r] = troca;
		return i + 1;
	}

	public void printArray() {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
}
