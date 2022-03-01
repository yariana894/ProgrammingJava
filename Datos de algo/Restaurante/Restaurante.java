public class Restaurante {

	// 1 persona + 0,5 chocos ---> 3 personas
	// 1 patata comen 3 personas si sobran chocos
	// 0,5 chocos comen 3 personas si sobran patatas
	// no hace guisos para menos de grupos de tres

	// private double papas;
	// private double chocos;
	// private int clientes;

	/*
	 * Restaurante(double papas, double ch, int cl) { this.papas = papas; chocos =
	 * ch; clientes = cl; }
	 */

	public static int Clientes(double pat, double cho) {
		// tengo dos posibilidades
		// se me acaban los chocos
		int clientes = 0;
		if (pat > 2 * cho) {
			System.out.println("Sobran patatas");
			System.out.println("Se agotan los chocos");
			clientes = (int) (6 * cho);
			System.out.println("Comen: " + clientes + " clientes");
			return clientes;

		} else if (pat < 2 * cho) {
			System.out.println("Sobran chocos");
			System.out.println("Se agotan las patatas");
			clientes = (int) (3 * pat);
			System.out.println("Comen: " + clientes + " clientes");
			return clientes;

		} else {
			System.out.println("Se agotan las patatas");
			System.out.println("Se agotan los chocos");
			clientes = (int) (3 * pat);
			System.out.println("Comen: " + clientes + " clientes");
			return clientes;

			// se me acaban las patatas luego sobran chocos

		}
	}
}
