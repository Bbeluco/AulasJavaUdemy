package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.1);
		conjunto.add(2);
		conjunto.add(true);
		conjunto.add("TESTE");
		conjunto.add('#');
		
		System.out.println("Tamanho do conjunto é " + conjunto.size());
		conjunto.add("TESTE");
		conjunto.add('#');
		System.out.println("Tamanho do conjunto é " + conjunto.size());
		
		conjunto.remove(true);
		conjunto.remove("ASD"); //Linha retorna false pois nao existe esse valor no conjunto
		System.out.println("Tamanho do conjunto é " + conjunto.size());
		
		
		System.out.println(conjunto.contains(1.1));
		System.out.println(conjunto.contains(1.0));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); //União entre conjuntos
//		conjunto.retainAll(nums); //Intersecção entre conjuntos
		
		System.out.println(conjunto);
	}
}
