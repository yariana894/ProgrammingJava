package Armstrong;

import java.util.Scanner;

public class Armstrong {

	public static int potencia(int base, int exponente) {

		int res = base;
		for (int i = 0; i < exponente - 1; i++) {
			res = res * base;
		}
		return res;
	}

	public static boolean Armstrong(int numero) {
		int cifra1 = numero / 100;
		int cifra2 = (numero - 100 * cifra1) / 10;
		int cifra3 = numero - 100 * cifra1 - 10 * cifra2;
		int dat = potencia(cifra1, 3) + potencia(cifra2, 3) + potencia(cifra3, 3);
		if (dat == numero)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * int b; int e;
		 * 
		 * 
		 * System.out.println("Base: "); b = sc.nextInt();
		 * System.out.println("Exponente: "); e = sc.nextInt();
		 * 
		 * System.out.println(b + "elevado a " + e + "da: " + potencia(b, e));
		 */

		System.out.println("Introduce un número de 3 dígitos: ");
		int num = sc.nextInt();

		System.out.println("Es armstrong: " +Armstrong(num));

		sc.close();
	}
}
