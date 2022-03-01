package Resueltos;

import java.util.Scanner;

public class once {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * reaaliza un programa con una variable entera t la cual contiene un tiempo en
		 * segundos y queremos ocnocer este tiempo pero expresado en horas, minutos y
		 * segundos.
		 */
		int tiempo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce t: ");
		tiempo=sc.nextInt();
		
		//pasar tiempo a minutos
		
		
		System.out.println("El tiempo en segundos es: " +tiempo);
		
		int horas, minutos, segundos, auxiliar, dias;
		
		auxiliar=tiempo/60; //260 en foto
		segundos=tiempo%60; // 40 seg en foto
		horas=tiempo/3600; //4 horas en foto
		dias=(tiempo/3600)/24;
		minutos=(tiempo/60)%60; //20 min en foto
		
		System.out.println("Son " +dias+ "días" +horas+ " horas " +minutos+ " minutos " +segundos+ " segundos");

	}

}
