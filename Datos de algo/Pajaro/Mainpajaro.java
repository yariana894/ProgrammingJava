
public class Mainpajaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declarando un pájaro
		Pajaro felipe;
		
		//crea un pájaro con new y se lo asigna a la referencia p
		felipe = new Pajaro();
		
		
		//con el constructor con un parámetro
		Pajaro loco = new Pajaro(42);
		
		//otro pájaro
		Pajaro paco=new Pajaro('v');
		paco.setedad(10);
		
		//ajusta la edad de felipe
		felipe.setedad(5);
		
		//saca a consola la edad
		felipe.printedad();
		felipe.printcolor();
		
		//setear el color
		loco.setcolor('v');
		
		//saca a consola la edad
		loco.printedad();
		loco.printcolor();
		
		//datos de paco
		System.out.println("La edad de paco es: " +paco.getedad());
		
		System.out.println("La edad de paco es: " +paco.getcolor());
		
		//uso de to string para fenix
		System.out.println("fenix.toString()");

	}

}
