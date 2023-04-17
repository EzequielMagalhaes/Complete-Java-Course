package application;
import java.util.Locale;
import java.util.Scanner;

public class _12_For{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números o FOR deve percorrer para somar?");
		int n = sc.nextInt();
		int soma = 0;
		int x = 0;
		System.out.println("Insira um valor para a variável 'x'");
		for(int i=0; i < n; i+=1) { // assim como o incremento "i+=1" existe o decremento "i--"
			System.out.printf("%d + ",soma);
			x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*			FOR
* - É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
*
*		Quando usar o FOR ?
* - Quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.
* 
* 	for ( inicio ; condição ; incremento ){		inicio-> Executa somente na primeira vez
* 		condição 1								condição-> V: Executa e volta // F: Pula fora 
* 		condição 2								incremento-> Executa toda vez depois volta 
* 	}
*/