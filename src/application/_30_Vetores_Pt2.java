//	VETORES DO 'TIPO REFERÊNCIA'	//

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Mercadoria;

public class _30_Vetores_Pt2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas mercadorias serão analisadas?");
		int n = sc.nextInt();
		Mercadoria[] vect = new Mercadoria[n];
		for(int i = 0; i < vect.length; i++){ //ao invés de 'n' usar o vect.length... da na mesma, mas fica de uma forma mais coesa.
			sc.nextLine(); // só serve para consumir a quebra de linha que ficou pendente (ln.14).
			System.out.printf("Nome da %dª mercadoria:%n", i+1);
			String nome = sc.nextLine();
			System.out.printf("Preço da %dª mercadoria:%n", i+1);
			double preco = sc.nextDouble();
			vect[i] = new Mercadoria(nome,preco);
		}
		double soma = 0.0;
		for(int i = 0; i < vect.length; i++){
			soma += vect[i].getPreco();
		}
		double media = soma / vect.length;
		
		System.out.printf("A média de preço das mercadorias é R$:%.2f%n",media);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*
	° Problema exemplo 1:
		- Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N mercadorias. Armazene as mercadorias em um vetor.
		Em seguida, mostrar o preço médio das mercadorias.
*/