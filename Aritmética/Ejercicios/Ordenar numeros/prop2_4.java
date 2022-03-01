package Propuestos;

import java.util.Scanner;

public class prop2_4 {
	
/*Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en
el ejemplo.
Por ejemplo para un número N = 12345 La salida debe ser:
1
12
123
1234
12345*/
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner esca= new Scanner (System.in);
		System.out.println("Introduce numero de 5 cifras");
		num = esca.nextInt();
		
		System.out.println("Al derecho");
		for(int i=4;i>=0;i--) {
       
		System.out.println(num/((int)Math.pow(10, i)) );
		
		}
		System.out.println("Al revés");
		for(int i=0;i<=4;i++) {
       
		System.out.println(num/((int)Math.pow(10, i)) );
		
		}
        
		}
	}
