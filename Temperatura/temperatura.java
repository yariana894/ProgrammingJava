
public class temperatura {
	private double tempF, tempC;
	public void setFaren(double f) {
		tempF=f;
	}
	public void setCenti(double c) {
		tempC=c;
	}
	public double centiaFaren() {
		return (1.8*tempC)+32;
	}
	public double farenaCenti() {
		return (tempF-32)/1.8;
	}
		
}
