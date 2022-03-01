package aritmeticos;

import java.util.Scanner;

public class comparar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int secreto=6;
		int intento;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce un entero: ");
		intento= sc.nextInt();
		
		if(intento==secreto)   {
			System.out.println("Has acertado"); }
		
		else if (intento>secreto) {
			System.out.println("numero introducido es mayor que el secreto");
		}
		else {
			System.out.println("numero introducido es menor que el secreto");
		}
		
	}//main

}
