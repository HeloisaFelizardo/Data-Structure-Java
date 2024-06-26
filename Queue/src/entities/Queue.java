/*
IsFull(V)
1. se tail=|V| ⊲|V| indica o tamanho de V
2. retorna VERDADEIRO
3. senão
4. retorna FALSO

Enqueue (V,x)
1. se ! IsFull (V) ⊲ ! indica a operação lógica NÃO
2. V [tail] ← x
3. tail ← tail + 1 
4. senão
5. erro overflow

IsEmpty()
1. se head = tail
2. retorna VERDADEIRO
3. senão
4. retorna FALSO

Dequeue (V)
1. se ! IsEmpty ()
2. x ← V[head]
3. head ← head + 1
4. retorna x
5. senão
6. erro underflow
 * 
 * 
 */

package entities;

public class Queue {
	private int[] array;
	private int head;
	private int tail;
	private int capacity;

	public Queue(int k) {
		capacity = k;
		array = new int[capacity];
		head = 0;
		tail = 0;
	}

	public boolean isFull() {
		return tail == capacity;
	}

	public void enqueue(int value) {
		if (!isFull()) {
			array[tail] = value;
			tail++;
		} else {
			System.out.println("Overflow Error");
		}
	}

	public boolean isEmpty() {
		return head == tail;
	}

	public int dequeue() {
		int x = 0;
		if (!isEmpty()) {
			x = array[head];
			head++;
			return x;
		} else {
			System.out.println("Underflow Error");
		}
		return x;
	}

	public void printQueue() {
		for (int i = head; i < tail; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
