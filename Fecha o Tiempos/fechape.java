package Propuestos;

import java.util.Scanner;

public class fechape {

	public static int pideFecha() {
		
	     int d,m,a;
			Scanner pilla=new Scanner(System.in);
			System.out.println("introduce dia: ");
			d=pilla.nextInt();
			System.out.println("introduce mes: ");
			m=pilla.nextInt();
			System.out.println("introduce año: ");
			a=pilla.nextInt();	
			pilla.close();
			return d+m+a;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int suma;
     int num;
    
		num=pideFecha();
		
		
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


