import java.util.Scanner;

public class rebajas {

	public static double porcentaje(double original, double actual) {
		return(original-actual)/original;
	}
	
	public static void main(String[] args) {
		double orig,act;
		double porc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame precio original");
		orig=sc.nextDouble();
		
		System.out.println("Dame precio original");
		act=sc.nextDouble();
		
		porc=porcentaje(orig,act);
		System.out.println("La rebaja es del " +porc);
	}

}
