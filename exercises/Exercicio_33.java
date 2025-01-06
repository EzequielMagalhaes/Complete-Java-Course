import java.util.Locale;
import java.util.Scanner;

public class Exercicio_33 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCÍCIO
1. Fazer um programa para ler um número inteiro 'N' e depois os dados(id, nome, salario) de 'N' funcionários. Não deve haver repetição de id.

Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id de valor X. Se o id
informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.

Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base
em uma operação de aumento por porcentagem dada.

			CONSOLE EXEMPLO
https://youtu.be/Xj-osdBe3TE --> gabarito em vídeo.
Quantos funcionários vão ser registrados? "3"

Funcionário #1:
Id: "333"
Nome: "Maria Brown"
Salário: "4000.00"

Funcionário #2:
Id: "536"
Nome: "Alex Gray"
Salário: "3000.00"

Funcionário #3:
Id: "772"
Nome: "Bob Green"
Salário: "5000.00"

Insira o id do funcionário que terá um aumento: "536"
	//Se inserir um id inexistente, é pra gerar um alerta.
Insira o id do funcionário que terá um aumento: "984"
Esse id não existe!
Insira a porcentagem do aumento : "10.0"

Lista de funcionários:
333, Maria Brown, 4000.00
536, Alex Gray, 3300.00 //aumentou 10%
772, Bob Green, 5000.00
*/