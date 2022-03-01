package switchs;

public class seleccionMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		motorr ola = new motorr();
		
		motorr eta = new motorr(3, "gas", "fuel");
		
		ola.dimeMotor();
		System.out.println(ola.toString());
		eta.dimeMotor();
		System.out.println(eta.toString());
	}

}
