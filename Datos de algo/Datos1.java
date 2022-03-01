package Resueltos;

public class Datos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a=7;
		System.out.println("la variable de tipo byte llamada a tiene asignado el valor: "+a);
		
		 
		short b, c=3;
		System.out.println("valor de c: "+c);
		
		int d = -30;
		int e = 0XC125;
		System.out.println("valor de e: "+e);
		
		long bprim=434123 ;
		long bseg=5l ; /* la L en este caso indica Long*/
		
		System.out.println("vale :"+ bseg);
		
		char car1='c';
		char car2=345; /*car1 y car2 son lo mismo porque el 99 en decimal es la ‘c’ */
		
		System.out.println("car1 vale :"+ car1);
		System.out.println("car2 vale :"+ car2);
		
		double pi=                            10d/3;
		System.out.println("pi como doble es: "+ pi);
		//error de precision
		float piseg=10f/3; /* la F en este caso indica Float*/
		System.out.println("pi como float es: "+ piseg);
		
		float medio=     1/2f; /*0.5*/
		System.out.println("medio: "+medio);
		float pepe=   1/2;
		System.out.println("pepe: "+pepe);
		double millon=1e6; /* 1x106 */
		double medioprim=1/2d; /*0.5 la D en este caso indica Double*/
		
		System.out.println(millon);
	}

}
