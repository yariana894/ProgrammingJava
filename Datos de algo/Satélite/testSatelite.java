
public class testSatelite {

	public static void main(String[] args) {
		
		satelite xabarin = new satelite();

		xabarin.setPosicion(-8, 42, 10);
		xabarin.printPosicion();
		
		satelite espuni = new satelite (31,52,15);
		espuni.printPosicion();
		espuni.setPosicion(12, -3, 8);
		espuni.printPosicion();
		
	}

}
