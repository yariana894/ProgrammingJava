package programacion;

import java.util.Scanner;

public class divEntera {
	public static void main(String[] args) {
		
	//Dividendo=divisor*cociente+modulo
	//Dividendo/divisor=cociente+modulo/divisor
	//variables
		int dividendo;
		int divisor;
		int cociente;
		int modulo;
		double resultado;
		Scanner sc=new Scanner(System.in);
		
		//entrada
		System.out.println("Introduce dividendo: ");
		dividendo=sc.nextInt();
		
		System.out.println("Introduce divisor: ");
		divisor=sc.nextInt();
	
		//algoritmo
		cociente=dividendo/divisor;
		modulo=dividendo/divisor;
		//fallo
		resultado=dividendo/(double)divisor;
		
		//salida
		System.out.println("El resultado de "+dividendo+" entre "+divisor+" es:");
		System.out.println("Cociente: "+cociente+" y modulo: "+modulo);
		System.out.println("El resultado es: " +resultado);
		
		sc.close();
	
	}
}
