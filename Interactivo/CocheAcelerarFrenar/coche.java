package CocheAcelerarFrenar;

public class coche {
	private int velocidad;

	coche() {
		velocidad = 0;

	}

	// este m�todo devuele la velocidad actual
	public int getVelocidad() {
		return velocidad;
	}

	// este m�todo actualiza la velocidad positiva

	public void acelera(int cantidad) {

		if (cantidad < 0) {
			System.out.println("Par�metro no v�lido");
		} else if (velocidad + cantidad > 120) {
			System.out.println("Te pasas");
		} else {
			velocidad += cantidad;
		}

	}

	// este m�todo actualiza la velocidad cantidad negativa
	public void frena(int cantidad) {

		if (cantidad < 0) {
			System.out.println("no llegas crack");
		} else if(velocidad - cantidad < 0)
			System.out.println("");
			velocidad -= cantidad;

		}

	public String toString() {
		return "coche[velocidad=" + velocidad + "]";
	}
	
	public void clava () {
		velocidad=0;
		System.out.println("vel "+velocidad);
		
	}
	
	public void full () {
		velocidad=120;
		System.out.println("vel "+velocidad);
		
	}
}
