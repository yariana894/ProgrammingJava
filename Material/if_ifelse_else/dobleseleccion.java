package if_ifelse_else;

public class dobleseleccion {

	public static void main(String[] args) {

		boolean cumple = false;
		boolean sigue = false;

		if (cumple) {
			if (sigue) {
				System.out.println("Cumple es true");
				System.out.println("sigue es true");
			} else {
				System.out.println("Cumple es true");
				System.out.println("sigue es false");
			}
		}

		else {
			if (sigue) {
				System.out.println("Cumple es false");
				System.out.println("sigue es true");
			} else {
				System.out.println("Cumple es false");
				System.out.println("sigue es false");
			}
		}
		System.out.println("Fin código");
	}

}
