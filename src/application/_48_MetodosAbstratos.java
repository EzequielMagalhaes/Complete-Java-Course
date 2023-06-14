package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Forma;
import entities.Retangulo;
import entities.Circulo;
import entities.enums.Cor;

public class _48_MetodosAbstratos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> lista = new ArrayList<>();
		
		System.out.println("Digite o número de formas:");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("DADOS DA FORMA #" + i + ":");
			System.out.println("Retângulo ou círculo(r/c)?");
			char forma = sc.next().charAt(0);				
			System.out.println("Cor(PRETO / AZUL / VERMELHO):");
			Cor cor = Cor.valueOf(sc.next());
			
			if(forma == 'r') {
				System.out.println("Largura:");
				double largura = sc.nextDouble();
				System.out.println("Altura:");	
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
				
			}else {
				System.out.println("Raio:");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}
		System.out.println(""); //linha vazia
		System.out.println("ÁREAS DAS FORMAS:");
		
		for (Forma forma : lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}
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
	° Notação UML : itálico.
*/