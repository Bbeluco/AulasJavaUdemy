package desafios;

import javax.swing.JOptionPane;

public class DiaSemana {
	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog(
				"Digite o nome do dia da semana:").toLowerCase();
		
		if(dia.equals("domingo")) {
			System.out.println("1");
		} else if(dia.equals("segunda")) {
			System.out.println("2");
		} else if(dia.equals("terça")) {
			System.out.println("3");
		} else if(dia.equals("quarta")) {
			System.out.println("4");
		} else if(dia.equals("quinta")) {
			System.out.println("5");
		} else if(dia.equals("sexta")) {
			System.out.println("6");
		} else if(dia.equals("sábado")) {
			System.out.println("6");
		}
		
	}
}
