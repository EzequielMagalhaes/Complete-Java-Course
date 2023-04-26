//	NOVA CLASSE PARA DEMONSTRAR MEMBROS ESTÁTICOS PT.2 //
package utils;

public class Calculator2 {

	public static final double PI = 3.14159; // Um membro estático.
	
	public static double circunferencia (double raio) {
		return 2.0 * PI * raio;
	}
	public static double volume(double raio) {
		return 4.0 * PI * (raio * raio * raio) / 3.0;
	}
}
