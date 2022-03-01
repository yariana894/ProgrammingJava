package Ejerciciospropuestos1;

public class MiNumero {

	private int n;

	MiNumero() {
	}

	MiNumero(int n) {
		this.n = n;
	}

	int getResta(int numero) {
		return numero - n;
	}

	int getValor() {
		return n;
	}

	int getDoble() {
		return 2 * n;
	}

	int getTriple() {
		return 3 * n;
	}

	void setNumero(int n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "MiNumero [n=" + n + ", getValor()=" + getValor() + ", getDoble()=" + getDoble() + ", getTriple()="
				+ getTriple() + "]";
	}
	
	

}
