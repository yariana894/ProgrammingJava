package Resueltos;

import java.util.Scanner;

public class Calculo1 {

	// declaracion de constantes
	static final double PI = 3.141592;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaracion de variables
		Scanner objetoesc = new Scanner(System.in);
		double radio;
		double longitud;

		// ENTRADA
		System.out.println("Por favor introduce el radio: ");
		radio = objetoesc.nextDouble();

		// ALGORITMO
		longitud = 2 * PI * radio;

		// SALIDA
		System.out.println("la long de la circ es: " + longitud);

	}

}
