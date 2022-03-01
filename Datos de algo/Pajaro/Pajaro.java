
public class Pajaro {

		//*** atributos o propiedades ****
		//declarados como privados
	
		private char color; 
		private int edad;
		
		//*** métodos de la clase ****
		//metodos set permiten ajustar los atributos
		
		public void setedad(int e){
			edad = e;
			}
		
		public void setcolor(char c){
			color = c;
			}
		
		//constructor por defecto
		
		Pajaro(){
			
		}
		
		//constructor con algún parámetro
		Pajaro(int e){
			edad=e;
			
		}
		Pajaro(char c){
		
			color=c;
		}
		
		//metodo heredado de la cllase objetc
		@Override
		public String toString() {
			return "pajaro [color=" + color + ", edad=" + edad + "]";
		
		}
		
		Pajaro(char col, int ed) {
			//super();
			if(col=='v' || col=='a' ||col=='g' ||col=='n' ||col=='b') {
			       this.color = col;
			}else {
				this.color=' ';
				System.out.println("leiste el enunciado?");
			}
			if(ed>0) {
			this.edad = ed;}
			else {System.out.println("Edad no valida ");
			
			}
		}

		//métodos get permiten conocer el valor de los atributos
		public int getedad() {
			return edad;
		}
		
		public char getcolor(){
			return color;
		}
		
		//métodos porque si
		
		public void printedad() {
			System.out.println(edad);
		}
		
		public void printcolor(){
			
		switch(color){
		
		//Los pájaros son verdes, amarillos, grises, negros o blancos
		//No existen pájaros de otros colores
		
		case 'v': System.out.println("verde");
			break;
		
		case 'a': System.out.println("amarillo");
			break;
		
		case 'g': System.out.println("gris");
			break;
		
		case 'n': System.out.println("negro");
			break;
		
		case 'b': System.out.println("blanco");
			break;
		default: 
			System.out.println("color no establecido");
		}
	}
}