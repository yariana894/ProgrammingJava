
public class peso {

	// atributo solo en KG
	// atributo SOLO en KG
	double peso = 0;

	// constructor PASANDO numero Y MEDIDA
	//guarda SIEMPRE el atributo PESO en kilogramos

	peso(double numero, String medida) {

		switch (medida) {

		case "kilogramos":
			peso = numero;
			break;
		case "gramos":
			peso = numero / 1000;
			break;
		case "lingotes":
			peso = numero * 14.59;
			break;
		case "libras":
			peso = numero * 0.453;
			break;
		case "quintales":
			peso = numero * 43.3;
			break;
		case "onzas":
			peso = numero * 0.02835;
			break;
		case "peniques":
			peso = numero * 0.00155;
			break;
		case "piedras":
			peso = numero * 6.35029;
			break;
		default:
			System.out.println("unidad desconocida");
			peso= 0d;
		}

	}

	public void mos() {
		System.out.println( "[peso=" + peso + " KG]");
	}

	// devuelv el peso en la medida en que me lo pidan (se pase como parametro)
	public double damePeso(String medida) {

		switch (medida) {

		case "kilogramos":
			return peso;

		case "gramos":
			return 1000 * peso;

		case "lingotes":
			return peso / 14.59;

		case "libras":
			return peso / 0.453;

		case "quintales":
			return peso / 43.3;

		case "onzas":
			return peso / 0.02835;

		case "peniques":
			return peso / 0.00155;

		case "piedras":
			return peso / 6.35029;

		default:
			System.out.println("unidad desconocida");
			return 0d;
		}
	}

}