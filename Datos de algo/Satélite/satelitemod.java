
	/*Método void variaAltura(double desplazamiento). Este método acepta un parámetro que será positivo o
	negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
	Método boolean enOrbitaQ. Este método devolverá false si el satélite está en tierra y true en caso
	contrario.
	Método void variaPosicion(double variap, double variam). Este método permite modificar los atributos de
	posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos parámetros serán valores
	positivos o negativos relativos que harán al satélite modificar su posición.
	*/

public class satelitemod {

	/* rango de paralelos de -90 a +90
	 * rango de meridianos de -180 a +180
	 * rango de distancia de 0 a +400*/

	/*mejorar programa, crear metodos, metodo filtro*/

	public class sateliteR {

		private double meridiano;
		private double paralelo;
		private double distancia;

		// filtrar
		sateliteR(double m, double p, double d) {
			meridiano = m;
			paralelo = p;
			distancia = d;
		}

		sateliteR() {
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
			
			if((meridiano <= -180 && meridiano >= +180) ||(paralelo <= -90 && paralelo >= +90) || (distancia <= 0 && distancia >= 400)) return false;
			
			// comprobaciones de m de p y de d
			// si es ok cambiamos el booleano vale a True
			return true;

		}

		public void variaAltura(double desplazamiento){
			
			distancia+=desplazamiento;
		
			
		}
		public void variaPosicion(double variap, double variam){
			
			paralelo+=variap;
			meridiano+=variam;
		}
		
		boolean enOrbita() {
			if(distancia==0)
				return false;
			else
				return true;
		}
		
	}

	
}
