package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_44_46 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	// 1.
		
		
	// 2. 
		
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCICIO
1.	Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
Funcionários terceirizados possuem ainda uma despesa adicional.
	O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda
recebem um bônus correspondente a 110% de sua despesa adicional.
	Fazer um programa para ler os dados de 'N' funcionários ('N' fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados,
mostrar o nome e pagamento de cada funcionário na mesma ordem em que foram digitados.

2.	Fazer um programa para ler os dados de 'N' produtos ('N' fornecido pelo usuário). Ao final , mostrar a etiqueta de preço de cada produto na mesma
ordem em que foram digitados.
	Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação. Estes dados
específicos devem ser acrescentados na etiqueta de preço. Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
*/