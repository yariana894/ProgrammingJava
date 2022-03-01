package Propuestos;

import java.util.Scanner;

public class prop2_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner esca= new Scanner (System.in);
		System.out.println("Introduce numero de 3 cifras");
		num = esca.nextInt();
		
		System.out.println("Al derecho");
		for(int i=2;i>=0;i--) {
       
		System.out.println(num/((int)Math.pow(10, i)) );
		
		}
		System.out.println("Al revés");
		for(int i=0;i<=2;i++) {

		System.out.println(num%10 );
		num=num/10;
		
		System.out.println("con while");
		while(num>0)

		System.out.println(num%10 );
		num=num/10;
		
        
		}
	}

}
