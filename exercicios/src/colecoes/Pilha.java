package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<String>();
		pilha.add("O pequeno principe");
		pilha.push("Don Quixote");
		pilha.push("O Hobbit");
		
		System.out.println(pilha.peek());
		System.out.println(pilha.element());
		
		for(String p: pilha) {
			System.out.println(p);
		}
		
		System.out.println(pilha.pop());
		System.out.println(pilha.poll());
	}
}
