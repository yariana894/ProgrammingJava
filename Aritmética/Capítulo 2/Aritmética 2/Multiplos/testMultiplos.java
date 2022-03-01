package propuestos;

import java.util.Scanner;

public class testMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner esc = new Scanner(System.in);
		System.out.println("Introduce un numero real: ");
		double n = esc.nextDouble();
		multiplos calc= new multiplos(n);
		
		calc.mostrar();
		
	}

}
