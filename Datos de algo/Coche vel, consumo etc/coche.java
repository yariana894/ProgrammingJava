package propuestos;

public class coche {

	//atributos
	String marca;
	String modelo;
	
	//constructor por defecto
	coche(){
		
	}
	
	//constructor con pase de parámetros
	coche(String mar, String mod){
		this.marca=mar;
		this.modelo=mod;
	}

	
	
	public void setMarca(String marca) {
		this.marca = marca;

	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "coche [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
}
