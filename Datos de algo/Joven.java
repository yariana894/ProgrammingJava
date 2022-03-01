package Resueltos;

import java.util.Scanner;

public class Joven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		int nivel;
		int ingresos;
		Scanner sc = new Scanner(System.in);
		boolean jasp;

		System.out.println("Introduce edad: ");
		edad = sc.nextInt();
		System.out.println("Introduce nivel: ");
		nivel = sc.nextInt();
		System.out.println("Introduce ingresos: ");
		ingresos = sc.nextInt();

		/*
		 * Verdadero si la edad es menor o igual a 28 el nivel de estudios es mayor que
		 * tres y los ingresos superan los 28.000€
		 */

		jasp = (edad <= 28) && (nivel > 3) && (ingresos > 28.000);
		System.out.println("¿Eres Jasp?" + jasp);

	}

}
