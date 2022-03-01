package Propuestos;

import java.util.Scanner;

/*Por ejemplo:
Si la fecha de nacimiento es 12/07/1980
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 28
Número de la suerte: 28*/

//SOLO UNA CIFRA

public class lucky {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		int num;
		int d,m,a;
		Scanner pilla=new Scanner(System.in);
		System.out.println("introduce dia: ");
		d=pilla.nextInt();
		System.out.println("introduce mes: ");
		m=pilla.nextInt();
		System.out.println("introduce año: ");
		a=pilla.nextInt();
		//primera 
		num=d+m+a;
		
		//HAZ 
		do {
		suma=0;
		//cifra a cifra y acumulo
					
		
								while(num>0) {
										
										//System.out.println(num%10);
										//voy sumando
										suma+=(num%10);
										//System.out.println(suma);
										num=num/10;
										//System.out.println(num);
										}
						
		
					num=suma;
		}while(suma>9);//mientras no me quede en una cifra
		
		//muestro suma
		System.out.println("tu lucky number: "+suma);
		
	}

}