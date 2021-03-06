package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e Add -> adicionam elementos a fila
		
		//Diferença no comportamento ocorre quando a fila esta cheia
		fila.add("Natalia"); //Retorna false
		fila.offer("Bruno"); //retorna uma exceção
		fila.add("Ana");
		fila.offer("Carlos");
		
		//Peek e element -> obtem o próximo elemento da fila (sem remover)
		
		//Diferença no comportamento ocorre quando a fila esta vazia
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.element()); // Lança uma exceção
		
		//Poll e remove -> obtem o próximo elemento da fila (e remove)
		//Diferença no comportamento ocorre quando a fila esta vazia
		
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); //Lança uma exceção
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		
		
	}
}
