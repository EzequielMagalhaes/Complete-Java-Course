package application;

import java.util.Locale;
import java.util.Scanner;
import utils.Calculator;

/*	versão 1.
public class _22_MembrosEstaticos extends Calculator{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o raio: ");
		double raio = sc.nextDouble();
		double c = circunferencia(raio);
		double v = volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", PI);
		}
		public static final double PI = 3.14159; // Um membro estático.
		
		public static double circunferencia (double raio) {
			return 2.0 * PI * raio;
		}
		public static double volume(double raio) {
			return 4.0 * PI * (raio * raio * raio) / 3.0;
		}
	}
*/
/*	versão 2.
public class _22_MembrosEstaticos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator(); // Excluí o 'static' da classe 'utils'. Para dar continuidade,
											// é necessário instanciar um objeto 'calc' a partir de 'Calculator'.
		System.out.println("Insira o raio: ");
		double raio = sc.nextDouble();
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", calc.PI);
*/
//	versão 3.
public class _22_MembrosEstaticos{
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o raio: ");
		double raio = sc.nextDouble();
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", Calculator.PI);

		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*		MEMBROS ESTÁTICOS
* ° Também chamados membros de clase
* 	- Em oposição a membros de instância 
* ° São membros que fazem sentido independentemente de objetos. Não precisam de objetos para serem chamados.
* 	São chamados a partir do próprio nome da classe.
* ° Aplicações comuns:
* 	- Classes utilitárias > Math.sqrt(double)
* 	- Declarações constantes.
* ° Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.
*/