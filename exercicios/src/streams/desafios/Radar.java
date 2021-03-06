package streams.desafios;

import java.util.Arrays;
import java.util.List;

public class Radar {
	public static void main(String[] args) {
		Carro camaro = new Carro("Camaro","FXR9868", 60);
		Carro unoComEscada = new Carro("Uno", "AAA1111", 300);
		Carro corolla = new Carro("Corolla", "BBB0000", 50);
		
		List<Carro> carros = Arrays.asList(camaro, unoComEscada, corolla);
		
		carros.stream()
			.filter(c -> c.placa.charAt(0) == 'A')
			.filter(c -> c.velocidade >= 70)
			.map(c -> "Encontramos o carro roubado em fuga seu modelo é " + c.nome)
			.forEach(System.out::println);
		
	}
}
