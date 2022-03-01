package CocheVelConsumo;

/*kms. kilometros recorridos por el coche,
 * litros. Litros de combustible consumido,
 * vmed. Velocidad media,
 * pgas. Precio de la gasolina.
 * Métodos:
 * getTiempo. Indicará el tiempo empleado en realizar el viaje
 * consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).
 * consumoEuros. Consumo medio del vehiculo (en euros cada 100 kilometros).*/

public class consumo {
	
	//atributos
	double kms;
	double litros;
	double vmed;
	double pgas;
	
	//constructores
	consumo(){}

	public consumo(double kms, double litros, double vmed, double pgas) {
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}
	
	
	public void setKms(double kms) {
		this.kms = kms;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public void setVmed(double vmed) {
		this.vmed = vmed;
	}

	public void setPgas(double pgas) {
		this.pgas = pgas;
	}

	public double tomarTiempo() {
		return kms/vmed;
		
	};
	
	
	
	//litros cada 100km
	public double consumirMedio() {
		return litros/(kms/100);
	};
	
	
	//euros cada 100km
	public double consumirEuros() {
		return pgas*(litros/(kms/100));
		
	};

	
	
	@Override
	public String toString() {
		return "consumo [kms=" + kms + ", litros=" + litros + ", vmed=" + vmed + ", pgas=" + pgas + "]";
	}
}
