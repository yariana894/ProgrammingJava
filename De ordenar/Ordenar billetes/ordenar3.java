package Ordenar_Letras;

import java.util.Scanner;

public class ordenar3 {

	public static void main(String[] args) {

		// LOS TRES ENTEROS DISTINTOS
		// CONDICINES LÓGICAS SIN COMBINAR CON AND U OR
		Scanner esc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;

		// petición de los tres
		System.out.println("dato a: ");
		a = esc.nextInt();

		System.out.println("dato b: ");
		b = esc.nextInt();

		System.out.println("dato c: ");
		c = esc.nextInt();

		// ordenamiento de los tres
		// seis casos

		if (a > b) {

			if (a > c) {// a es el mayor
				System.out.println(" a es el mayor" + a);
				
				//FALTA COMPARAR B CON C
				if (b > c) {
				System.out.println(" c es el menor" + c); //a>b>c
				}
				else {
				System.out.println(" b es el menor" + b); //a>c>b
				}
				
			}
			// c>a
			else {// c es el mayor
				System.out.println(" c es el mayor" + c); //c>a>b
				System.out.println(" b es el mayor" + b);
			}

		}
		// b>a
		else {

			if (b > c) {// b es el mayor
				System.out.println(" b es el mayor" + b);
				
				//FALTA COMPARAR A CON C
				if (a > c) {
				System.out.println(" c es el menor" + c); //b>a>c
				} else {
					System.out.println(" a es el menor" + a); //b>c>a
					}
					
			}
			else {
				System.out.println(" c es el mayor" + c); //c>b>a
				System.out.println(" a es el mayor" + a);

			}

		}

	}

}

// Resultado del ordenamiento