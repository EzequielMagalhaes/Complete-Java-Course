import java.util.Locale;
import java.util.Scanner;
public class _3_EntradaDeDados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // para considerar o separador de decimais como ponto, ao invés de vírgula;
		// PRECISA ESTAR ANTES DA DECLARAÇÃO DO SCANNER;
		Scanner sc = new Scanner(System.in); //Associando o objeto scanner ao teclado do modo console;
		
		/*
		System.out.println("Determine um nome para a variável 'X': ");
		String x;
		x = sc.next();
		System.out.println("A variável 'X' tem o nome:\n" + x);
		
		System.out.println("Digite um valor para a variável 'Y': ");
		int y;
		y = sc.nextInt();
		System.out.println("O valor de 'Y' é: " + y);
		
		System.out.println("Determine um nome para a variável 'Z':");
		double z;
		z = sc.nextDouble();
		System.out.printf("O valor de 'Z' é: %.2f%n", z);
		
		System.out.println("Digite um nome para a variável 'W': ");
		char w;
		w = sc.next().charAt(0);//pega o primeiro caractere da String, funciona como um array;
		System.out.println("O valor de 'W' é: " + w); 
		*/
		
			//	INSERIR DADOS NA MESMA LINHA SEPARANDO POR ESPAÇOS //
		
		String x;
		int y;
		double z;
		System.out.println("Insira um 'nome', um número 'inteiro' e um número com casas decimais do tipo 'double': ");
		System.out.println("*SEPARANDO-OS APENAS POR ESPAÇOS*");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
}
