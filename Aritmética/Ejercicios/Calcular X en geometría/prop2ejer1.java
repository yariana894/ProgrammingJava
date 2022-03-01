package Propuestos;

import java.util.Scanner;

public class prop2ejer1 {
	public static void main(String[] args) {
		
		double v;
		double radio;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce radio: ");
		radio= sc.nextDouble();
		
		v=4*Math.PI*Math.pow(radio, 3)/3;
		System.out.println("El volumen es: "+v);
				
		

	}

}
