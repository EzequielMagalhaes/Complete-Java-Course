package application;

import java.util.Locale;
import java.util.Scanner;

public class _42_Composicao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.print("Insira os dados do trabalhador: ");
		System.out.println("Nome: ");
		String nomeFuncionario = sc.nextLine();
		System.out.println("Nível: ");
		String nivelFuncionario = sc.nextLine();
		System.out.println("Salário base: ");
		double salarioBase = sc.nextDouble();
		System.out.println("Quantos contratos para esse trabalhador? ");
		System.out.println("Insira os dados do #1 2 3 contrato: ");
		System.out.println("Data (DD/MM/YYYY): ");
		System.out.println("Valor por hora: ");
		System.out.println("Duração(Horas): ");
		System.out.println(); //pular linha.
		System.out.println("Insira o mês e ano para calcular a renda (MM/YYYY): ");
		System.out.println("Nome: ");
		System.out.println("Departamento: ");
		System.out.println("Renda de MM/YYYY: %f" );		
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				Composição 
	° É um tipo de associação que permite que o objeto contenha outro.
	° Relação "tem-um" ou "tem-varios".
	° Vantagens:
		- Organização: divisão de responsabilidades.
		- Coesão.
		- Flexibilidade.
		- Reuso.
	° Nota: embora o símbolo UML para composição(todo-parte) seja o diamante preto, neste contexto estamos chamando de composição
	qualquer associação tipo "tem-um" e "tem-vários".
*/