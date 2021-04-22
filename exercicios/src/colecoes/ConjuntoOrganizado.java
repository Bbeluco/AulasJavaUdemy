package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrganizado {
	public static void main(String[] args) {
//		Set<String> listaAlunos = new HashSet<>();
		SortedSet<String> listaAlunos = new TreeSet<>();
		listaAlunos.add("Sophia");
		listaAlunos.add("Carlos");
		listaAlunos.add("Rebeca");
		listaAlunos.add("Bruno");
		System.out.println(listaAlunos);
		
		
		Set<Integer> nums = new HashSet<>();
		nums.add(10);
		nums.add(5);
		nums.add(1);
		nums.add(12);
		System.out.println(nums);
	}
}
