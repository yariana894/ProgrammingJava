package Chispas3;

import java.util.Scanner;

public class imprimirPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int res, fil;
		System.out.println("par(2) o impar(1): ");
		res = sc.nextInt();

		if (res == 2) {
			System.out.println("Cuantas pares desea imprimir: ");
			fil = sc.nextInt();
			for (int i = 1; i <= res; i++) {
				System.out.println(2 * i);
			}

		} else if (res == 1) {
			System.out.println("Cuantas impares desea imprimir: ");
			fil = sc.nextInt();
			for (int j = 1; j < 5; j++) {
				System.out.println(2 * j - 1);
			}
		}
	}
}
