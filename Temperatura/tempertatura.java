package Propuestos;

import java.util.Scanner;

public class tempertatura {


	
	
    public static double centAFahr (double temp) {
    	
		double aux=0d;
		aux=32 + (9*temp/5);
		return aux;
    	
	
    }
    static Scanner esc;
	
	public static double fahrACent (double temp) {
		double aux=0d;
		aux=((5*(temp-32)/9));
		return aux;	
		
	}
	
	
	public static double pideDato() {
		
		double aux;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce temperatura: ");
		aux= sc.nextDouble();
		return aux;
	}
	
	
	
	public static void main(String[] args) {
		
		double t;
		int r;
		Scanner esc=new Scanner (System.in);
		
		do {
		
		System.out.println(" 1 de c a f-----2 de f a c------3 salir");
		r=esc.nextInt();
		
		switch(r) {
		case 1:
			t=pideDato();
			System.out.println("en F: "+centAFahr(t));
			break;
		case 2:
			t=pideDato();
			System.out.println("en C: "+centAFahr(t));
			break;
		case 3:
			System.out.println("Hasta luego");
			break;
		default:
			System.out.println("no valido");
			
		
		
		

		 }
		
	   } while (r!=3);
	}

}
