package application;

import entities.Stack;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printStack(); // Imprime: 1 2 3 4 5
		stack.pop();
		stack.pop();
		stack.pop();
		stack.printStack(); // Imprime: 1 2
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.printStack(); // Imprime: 1 2 6 7 8
		
	}


}
