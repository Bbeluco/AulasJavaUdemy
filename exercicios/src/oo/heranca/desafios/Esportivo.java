package oo.heranca.desafios;

public interface Esportivo {
	void ligarTurbo();
	void desligarTurbo();
	
	default int turbina() {
		return 1;
	}
}
