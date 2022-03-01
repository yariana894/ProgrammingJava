package Propuestos;

enum vocales{

a, e, i, o, u;
}


public class ejercicio8 {

	
	public static char Generar() {
		
		//son *26 caracteres
		return (char) (Math.random()*26 + 'a');
		
	}
	
	public static void main(String[] args) {
		// Identificar si es vocal o no.
		
		char L;
		for(int i=1; i<=10; i++) {
			
			L=Generar();
			System.out.println( L);
			
			//cambiar condicion logica
		
		if( (L=='a') || (L=='e') || (L=='i') || (L=='o') || (L=='u')    ) {
			System.out.println("VOCAL");
		}
		
		
		
		else { 
			System.out.println("CONSONANTE");
		}
	}
	

	}

}
