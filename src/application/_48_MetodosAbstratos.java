package application;

import java.util.Locale;
import java.util.Scanner;

public class _48_MetodosAbstratos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*			MÉTODOS ABSTRATOS
	° São métodos que não possuem implementação.
	° Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação.
	° Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata.
*/