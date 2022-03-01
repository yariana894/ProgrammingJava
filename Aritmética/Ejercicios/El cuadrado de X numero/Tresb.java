package Propuestos;

import java.util.Scanner;

public class Tresb {

	public static int CalcularCuadrado(int numero) {
		int cuad = numero * numero;
		return cuad;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int resultado;
		Scanner pilla=new Scanner (System.in);
		System.out.println("Introduce un número: ");
		numero=pilla.nextInt();
		
		resultado=CalcularCuadrado(numero);
				
	System.out.println("EL CUADRADO DE " + numero + " ES: " + resultado);

	}

}
