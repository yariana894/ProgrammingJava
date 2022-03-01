package propuestos;

/*Realiza una clase minumero que proporcioe el doble, triple y cuádruple
 * de un numero proporcionado en su constructor
 * (Realiza un método para doble, otro para triple y otro para cuádruple).
 */
 


public class multiplos {

	double numero;
	
	public multiplos (double numero) {
		super();
		this.numero = numero;	
	}
	
	public double doble() {
		return 2*numero;
		};
	public  double triple() {
		return 3*numero;
	};
	public  double cuadruple() {
		return 4*numero;
	};

	public void mostrar() {
		System.out.println(this.toString());
		
	}

	@Override
	public String toString() {
		return "multiplos [numero=" + numero + ", doble()=" + doble() + ", triple()=" + triple() + ", cuadruple()="
				+ cuadruple() + "]";
	}
	
}
