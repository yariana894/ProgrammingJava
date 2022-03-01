
/* rango de paralelos de -90 a +90
 * rango de meridianos de -180 a +180
 * rango de distancia de 0 a +400*/

/*mejorar programa, crear metodos, metodo filtro*/

public class satelite {

	private double meridiano;
	private double paralelo;
	private double distancia;

	//filtrar
	satelite(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia = d;
	}

	satelite() {
		meridiano = paralelo = distancia = 0;
	}

	//filtrar
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
		System.out.println( this.toString());
	}
	
	public boolean filtro() {
		boolean vale=false;
		
		//comprobaciones de m de p y de d
		//si es ok cambiamos el booleano vale a True
		
		return vale;
		
	}
	
	

}
