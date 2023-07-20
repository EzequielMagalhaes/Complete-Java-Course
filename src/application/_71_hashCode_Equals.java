package application;

import java.util.Locale;
import java.util.Scanner;

public class _71_hashCode_Equals {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String a = "Zekiel";
		String b = "Nathy";
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*					HASH CODE
	° São operações da classe Object utilizadas para comparar se um objeto é igual a outro.
		- equals: lento, resposta 100%.
		- hashCode: rapido, porém resposta positiva não é 100%.
	° Tipos comuns(String, Date, Integer, Double, etc) já possuem implementação para essas operações. Classes personalizadas precisam sobrepô-las.
	
	° Equals
		- Método que compara se o objetivo é igual a outro, retornando true ou false.
		
	° Regra de ouro do hashCode
		- Se o hashCode de dois objetos for diferente, então os dois objetos são diferentes.
		- Se o código de dois objetos for igual, MUITO PROVAVELMENTE os objetos são iguais(pode haver colisão).
*/