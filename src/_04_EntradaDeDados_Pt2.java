import java.util.Scanner;

public class _04_EntradaDeDados_Pt2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1,s2,s3; 
		
		System.out.println("Digite um valor inteiro para 'X': ");
		x = sc.nextInt();
		sc.nextLine();// String vazia, para ser consumida;
		System.out.println("Digite a primeira frase a seguir:");
		s1 = sc.nextLine(); // 'sc.next()' lê apenas uma palavra...'sc.nextLine()' lê a linha inteira;
		System.out.println("Digite a segunda frase a seguir:");
		s2 = sc.nextLine();
		System.out.println("Digite a terceira frase a seguir:");
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}


/*		
 *		EXPLICAÇÃO DA LINHA 10
 *
 *	Quando se usa um comando diferente do 'nextLine()'
 *  e dá alguma quebra de linha,
 *  essa quebra de linha fica "pendente"
 *  na esntrada padrão.
 *  
 *	Se eu então fizer um 'nextLine()',
 *	aquela quebra de linha pendente
 *	será absorvida pelo 'nextLine()'.
 *
 *
 *			COMO RESOLVER!
 *	Fazer um 'nextLine()' extra antes de fazer o 'nextLine()' de meu interesse.
 * 
 */