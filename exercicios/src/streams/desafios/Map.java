package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		Consumer<Integer> println = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inversor = 
				str -> new StringBuilder(str).reverse().toString();
				
		Function<String, Integer> conversorParaDec = 
				bin -> Integer.parseInt(bin, 2);
				
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inversor)
			.map(conversorParaDec)
			.forEach(println);
	}
}
