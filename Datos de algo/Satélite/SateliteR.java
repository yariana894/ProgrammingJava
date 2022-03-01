package Ejerciciospropuestos1;

public class SateliteR {

	private double desplazamiento;
	private boolean enOrbitaQ;
	private double variap;
	private double variam;

	private double meridiano;
	private double paralelo;
	private double distancia;

	// filtrar
	SateliteR(double m, double p, double d) {
		meridiano = m;
		paralelo = p;
		distancia = d;
	}

	SateliteR() {
		meridiano = paralelo = distancia = 0;
	}

	// filtrar
	public void setPosicion(double m, double p, double d) {
		variaPosicion(p, m);
		variaAltura(d);
	}

	@Override
	public String toString() {
		return "satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra=" + distancia + "]";
	}

	public void printPosicion() {
		System.out.println(this.toString());
	}

	boolean filtro() {

		if ((meridiano <= -180 && meridiano >= +180) || (paralelo <= -90 && paralelo >= +90)
				|| (distancia <= 0 && distancia >= 400))
			return false;

		// comprobaciones de m (-180 a +180) de p (-90 a +90) y de d (0 a 400)
		// si es ok cambiamos el booleano vale a True
		return true;

	}

	public void variaAltura(double desplazamiento) {
		this.distancia += desplazamiento;
	}

	public boolean isEnOrbita() {
		if (distancia == 0)
			return false;
		else
			return true;
	}

	public void variaPosicion(double variap, double variam) {
		this.paralelo += variap;
		this.meridiano += variam;
	}
	
	

}
