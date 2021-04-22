package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		Usuario a1 = new Usuario("Marcela");
		listaUsuarios.add(a1);
		
		listaUsuarios.add(new Usuario("Caio"));
		listaUsuarios.add(new Usuario("Hélio"));
		listaUsuarios.add(new Usuario("Bruno"));
		listaUsuarios.add(new Usuario("Bruno"));
		
		System.out.println(listaUsuarios.get(3)); //Acessa o objeto do índice escolhido
		
		listaUsuarios.remove(4);
		listaUsuarios.remove(new Usuario("Bruno"));
		
		System.out.println(listaUsuarios.contains(new Usuario("Caio")));
		
		for(Usuario u: listaUsuarios) {
			System.out.println(u.nome);
		}
	}
}
