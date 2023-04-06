import java.util.Locale;
import java.util.Scanner;

public class _9_ExpressaoCondicionalTernária {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco;
		System.out.println("Qual o preço do produto?");
		preco = sc.nextDouble();
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.5;
		
		System.out.println(desconto);
		sc.close();
	}
}

/*	MANEIRA SIMPLIFICADA DE ESCREVER UM IF E ELSE
 * 	( condição ) : valor_se_verdadeiro : valor_se_falso */
