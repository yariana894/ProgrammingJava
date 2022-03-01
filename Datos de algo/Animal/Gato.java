package Novatos;

public class Gato extends Animal {
	private int vida = 7;

	public Gato(String n, int e) {
		super(n, e);
		// TODO Auto-generated constructor stub
	}

	public int getVida() {
		return vida;
	}
	
	public void quitarvida() {
		vida--;
	}

	@Override
	public String toString() {
		return "Soy un gato, me llamo" +nombre+ ", tengo" +edad+ " años y me quedan " + vida + " vidas";
	}
	
	

}
