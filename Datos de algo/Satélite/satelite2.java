
/* rango de paralelos de -90 a +90
 * rango de meridianos de -180 a +180
 * rango de distancia de 0 a +400*/

/*mejorar programa, crear metodos, metodo filtro*/

public class satelite2 {

	private double meridiano;
	private double paralelo;
	private double distancia;

	// filtrar
	satelite2(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia = d;
	}

	satelite2() {
		meridiano = paralelo = distancia = 0;
	}

	// filtrar
	public void setPosicion(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia = d;
	}

	@Override
	public String toString() {
		return "satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra=" + distancia + "]";
	}

	public void printPosicion() {
		System.out.println(this.toString());
	}

	boolean filtro() {
		
		if((meridiano <= -180 && meridiano >= +180) ||(paralelo <= -90 && paralelo >= +90) || (distancia <= 0 && distancia >= 400)) return false;
		
		// comprobaciones de m de p y de d
		// si es ok cambiamos el booleano vale a True
		return true;

	}

}
