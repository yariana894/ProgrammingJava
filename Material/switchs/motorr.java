package switchs;

/*EJERCICIO

Considera estás desarrollando un programa Java donde necesitas trabajar con objetos de tipo Motor (que representa el motor de una bomba para mover fluidos). 
Define una clase Motor considerando los siguientes atributos de clase: tipoBomba (int), tipoFluido (String), combustible (String). 
Define un constructor asignando unos valores de defecto a los atributos y los métodos para poder establecer y obtener los valores de los atributos. 
Crea un método tipo procedimiento denominado dimeTipoMotor() donde a través de un condicional switch hagas lo siguiente:

a) Si el tipo de motor es 0, mostrar un mensaje por consola indicando 
“No hay establecido un valor definido para el tipo de bomba”.

b) Si el tipo de motor es 1, mostrar un mensaje por consola indicando 
“La bomba es una bomba de agua”.

c) Si el tipo de motor es 2, mostrar un mensaje por consola indicando 
“La bomba es una bomba de gasolina”.

d) Si el tipo de motor es 3, mostrar un mensaje por consola indicando 
“La bomba es una bomba de hormigón”.

e) Si el tipo de motor es 4,mostrar un mensaje por consola indicando 
“La bomba es una bomba de pasta alimenticia”.

f) Si no se cumple ninguno de los valores anteriores mostrar el mensaje 
“No existe un valor válido para tipo de bomba”.
*/


public class motorr {
		
		int tipoBomba;
		String tipoFluido;
		String combustible;
		
		public motorr() {}
		
		public motorr(int tipoBomba, String tipoFluido, String combustible) {
			this.tipoBomba = tipoBomba;
			this.tipoFluido = tipoFluido;
			this.combustible = combustible;
		}

		public int getTipoBomba() {
			return tipoBomba;
		}

		public void setTipoBomba(int tipoBomba) {
			this.tipoBomba = tipoBomba;
		}

		public String getTipoFluido() {
			return tipoFluido;
		}

		public void setTipoFluido(String tipoFluido) {
			this.tipoFluido = tipoFluido;
		}

		public String getCombustible() {
			return combustible;
		}

		public void setCombustible(String combustible) {
			this.combustible = combustible;
		}
		
		public void dimeMotor() {
			
			switch (tipoBomba) {
			
			case 0:
				System.out.println("No hay establecido un valor definido para el tipo de bomba.");
				break;
			case 1:
				System.out.println("La bomba es una bomba de agua.");
				break;
			case 2:
				System.out.println("La bomba es una bomba de gasolina.");
				break;
			case 3:
				System.out.println("La bomba es una bomba de hormigón.");
				break;
			case 4:
				System.out.println("La bomba es una bomba de pasta alimenticia.");
				break;
			default:
				System.out.println("No existe un valor válido para tipo de bomba.");
				
			
			
			}//fin switch
			
		}//fin dimetipo Motor
		
		
		
	}
	
