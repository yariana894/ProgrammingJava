package Es_amstrong;

import java.util.Scanner;

public class amstrong {

	public static int potencia(int base, int exponente) {

		int res = base;
		for (int i = 0; i < exponente - 1; i++) {
			res = res * base;
		}
		return res;
	}

	public static boolean numArmstrong(int n) {
		
		int dig=cuentaDigitos(n);
		int orig=n;
		int dat=0;
		
		//Chequeo
		while((n/10)>0) {
			dat=dat + (int) ( Math.pow((n%10),dig));
			n=n/10;
		}
		
		//version vieja
		//int cifra1 = numero / 100;
		//int cifra2 = (numero - 100 * cifra1) / 10;
		//int cifra3 = numero - 100 * cifra1 - 10 * cifra2;
		
		
		if (dat == orig)
		
			return true;
		else
			return false;
	}

	public static int cuentaDigitos (int n) {
		
		int cont=1;
		while(n>=10) {
			n=n/10;
			cont++;
		}
		
		return cont;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * int b; int e;
		 * 
		 * 
		 * System.out.println("Base: "); b = sc.nextInt();
		 * System.out.println("Exponente: "); e = sc.nextInt();
		 * System.out.println(b + "elevado a " + e + "da: " + potencia(b, e));
		 */
	}
	}
