package fundamentos.exercicios;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		byte a = 1;
		byte b = 12;
		byte c = -13;
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		double bhaskara = (-b + (Math.sqrt(delta))) / (2 * a);
		System.out.println("O valor de Bhaskara é: " + bhaskara);
		bhaskara = (-b - (Math.sqrt(delta))) / (2 * a);
		System.out.println("O valor de Bhaskara é: " + bhaskara);
	}
}
