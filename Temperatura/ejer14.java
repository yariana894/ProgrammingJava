package Propuestos;

import java.util.Scanner;

public class ejer14 {

	/*4. Programa que lea una cantidad de grados centígrados y la pase a
	 * Farenheit.
	 * La fórmula correspondiente es:
	 * 
	 * F = 32 + ( 9 * C / 5 ) 
	 * 
	 * Farhen a centigrados
	 * C= (5/9)*(f-32)
	 * */
	
	
	public static int pidegrados() {
		
		int grados, grafaren;
		Scanner pide = new Scanner (System.in);
		System.out.println("Introduce temperatura en Centigrados");
		grados = pide.nextInt();
		pide.close();
		return grados;
		
	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int num;
		int faren;
		num=pidegrados();
		
		faren=32 + (9*num/5);
		
		System.out.println("Son "+faren+"Farenheit ");
		
		
	
		

	}

}
