package Es_amstrong;

import java.util.Scanner;

public class testamstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * int b; int e;
		 * 
		 * 
		 * System.out.println("Base: "); b = sc.nextInt();
		 * System.out.println("Exponente: "); e = sc.nextInt();
		 * System.out.println(b + "elevado a " + e + "da: " + potencia(b, e));
		 */

		System.out.println("Introduce un número entero positivo: ");
		int num = sc.nextInt();

		System.out.println("Numero de Digitos: " + amstrong.cuentaDigitos(num));
		
		System.out.println("Es Amstrong: " + amstrong.numArmstrong(num));

		sc.close();
	}

}
