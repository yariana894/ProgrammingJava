package Propuestos;

import java.util.Scanner;

public abstract class Seis {
	
	
	final static double PI=3.141592;
	
	public static double calcArea(double r) {
		double area;
	    area=PI*Math.pow(r, 2) ;
	    return area;
		
	}
	
	public static double calcLongitud(double r) {
		double longitud;
		
		longitud=2*PI*r;
		return longitud;
	}
	
	public static double pideRadio() {
		Scanner esc= new Scanner (System.in);
		double radio;
		System.out.println("Introduzca radio: ");
		radio=esc.nextDouble();
		return radio;
		
		
	}

	public static void muestraResultados( ) {
		
		double dato=pideRadio();
		System.out.println("longitud es: " + calcLongitud( dato ) );
		System.out.println("area es: " + calcArea( dato ) );	
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     muestraResultados();
	}

}
