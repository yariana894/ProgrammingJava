package Novatos;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		System.out.println(a.toString());
		
		
		Gato g = new Gato("Paca", 2);
		System.out.println(g.toString());
		g.getVida();
	}

}
