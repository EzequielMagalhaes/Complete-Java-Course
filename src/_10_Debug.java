import java.util.Locale;
import java.util.Scanner;

public class _10_Debug {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Determine,em metros, a largura do terreno...");
		double largura = sc.nextDouble();
		System.out.println("Determine,em metros, o comprimento do terreno...");
		double comprimento = sc.nextDouble();
		System.out.println("Determine o preço do metro quadrado...");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f metros quadrados%n", area);
		System.out.printf("PREÇO = %.2f reais%n", preco);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}

/*			MODO DEBUG
	- Deixa o ponteiro de digitaçao no início da linha para debugar;
	- CTRL + SHIFT + B  ou botao direito do mouse > debug as > java application;
	- Para executar linha a linha pressione F6;
	- Para terminar, só clicar no STOP;
	- Por fim, trocar de perspectiva para voltar ao 'Java Aplication';
*/