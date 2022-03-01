import java.util.Scanner;

public class Ejercicio14 {
	
	public static double centAFahr(double temp) {
		
		double aux=0d;
		aux=32 + (9*temp/5);
		return aux;
	}
	
	public static double fahrACent(double temp) {
		double aux=0d;
		aux=((5*(temp-32)/9));
		return aux;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int r;
		System.out.println("1 para C a F para F a C----3 SALIR");
		r=sc.nextInt();
		
		switch(r) {
		case 1:{
		System.out.println("Temperatura de grados a Fahrenheit "  );
		}
		
		}
		double t;
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce temperatura: ");
		t=sc.nextDouble();
		
		System.out.println("en F: " +centAFahr(t));
		System.out.println("en F: " +fahrACent(t));
		
		
		

	}

}
