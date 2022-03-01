package Novatos;

public class Animal {

	protected String nombre;
	protected int edad;
	protected static int numAnimales = 0;

	public Animal() {
		nombre = "Desconocido";
		edad = 0;
		numAnimales++;
	}

	public Animal(String n, int e) {
		nombre = n;
		edad = e;
		numAnimales++;
	}

	Animal(Animal a) {
		this.nombre = a.getNombre();
		this.edad = a.getEdad();
		numAnimales++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int e) {
		edad = e;
	}

	@Override
	public String toString() {
		String s;
		s = "Hay" + this.numAnimales + "animales creados";
		s = "Soy "+ this.nombre + " y tengo " +this.edad+ " años";
		return s;
	}
	
	public Animal clone() {
		Animal a = new Animal(this.nombre, this.edad);
		return a;
	}
	
	public boolean equals(Animal a) {
		return (a.getEdad()== this.edad && this.nombre.equals(a.getNombre()));
	}
	
	

}
