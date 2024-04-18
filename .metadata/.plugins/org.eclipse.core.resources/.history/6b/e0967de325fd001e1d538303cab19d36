/*
IsFull(V)
1. se count = |V|
2.    retorna VERDADEIRO
3. senão
4.    retorna FALSO

Enqueue(V, x)
1. se !IsFull(V)
2.    V[tail % |V|] ← x
3.    tail <- tail + 1
4.    count <- count + 1
5. senão
6.    erro overflow


IsEmpty()
1. se count = 0
2.    retorna VERDADEIRO
3. senão
4.    retorna FALSO

Dequeue(V)
1. se !IsEmpty()
2.    x <- V[head % |V|]
3.    head <- head + 1
4.    count <- count - 1
5.    retorna x
6. senão
7.    erro underflow
*/

package entities;

public class CircleQueue {
	private int[] array;
	private int head;
	private int tail;
	private int quantity;
	private int count;

	public CircleQueue(int k) {
		quantity = k;
		array = new int[quantity];
		head = 0;
		tail = 0;
		count = 0;
	}

	public void enqueue(int value) {
		if (!isFull()) {
			array[tail % quantity] = value;
			tail++;
			count++;
		} else {
			System.out.println("Erro: overflow");
		}
	}

	public int dequeue() {
		int value = 0;
		if (!isEmpty()) {
			value = array[head % quantity];
			head++;
			count--;
		} else {
			System.out.println("Erro: underflow");
		}
		return value;
	}

	public boolean isFull() {
		return count == quantity;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public void printQueue() {
		if (isEmpty()) {
			System.out.println("A fila está vazia.");
			return;
		}
		System.out.print("Fila: ");
		for (int i = head; i < head + count; i++) {
			System.out.print(array[i % quantity] + " ");
		}
		System.out.println();
	}
}
