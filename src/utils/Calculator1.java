//	USADO NA CLASSE _22_MembrosEstaticos //
package utils;

public class Calculator1 {

	public final double PI = 3.14159; // Um membro estático.
	
	public double circunferencia (double raio) {
		return 2.0 * PI * raio;
	}
	public double volume(double raio) {
		return 4.0 * PI * (raio * raio * raio) / 3.0;
	}
}
