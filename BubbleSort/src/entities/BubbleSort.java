/*
O algoritmo de ordenação pelo método de bolhas, popularmente conhecido como 
Bubble Sort, é de simples aplicação e entendimento, porém ineficiente. Ele considera a 
troca repetitiva de elementos vizinhos que estão fora de ordem.

 BubbleSort (V)
1. para i <- 0 ate |V| - 1
2. 	  para j <- |V| - 1 ate i + 1
3.       se V[j] < V[j - 1]
4.          trocar V[j] com V[j - 1]
 */

package entities;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void order() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public void printBubbleSort() {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
