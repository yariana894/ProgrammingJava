
	/*M�todo void variaAltura(double desplazamiento). Este m�todo acepta un par�metro que ser� positivo o
	negativo dependiendo de si el sat�lite tiene que alejarse o acercarse a La Tierra.
	M�todo boolean enOrbitaQ. Este m�todo devolver� false si el sat�lite est� en tierra y true en caso
	contrario.
	M�todo void variaPosicion(double variap, double variam). Este m�todo permite modificar los atributos de
	posici�n (meridiano y paralelo) mediante los par�metros variap y variam. Estos par�metros ser�n valores
	positivos o negativos relativos que har�n al sat�lite modificar su posici�n.
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
