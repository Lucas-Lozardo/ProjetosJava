package entities;

public class Notas {
	public double primeiroTrimestre;
	public double segundoTrimestre;
	public double terceiroTrimestre;
	
	
	
	
	public double somaNotas() {
		return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
	}
	
	public double missingPoints() {
		if (somaNotas()<60.00) {
			return 60.00 - somaNotas();
		}
		else {
			return 00.00;
		}
	}
}
