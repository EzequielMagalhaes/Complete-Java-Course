package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Pedido;
import entities.enums.StatusPedido;

public class _41_Enumeracoes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pedido pedido = new Pedido(1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		System.out.println(pedido);
		
		StatusPedido os1 = StatusPedido.ENTREGUE; //instanciando um objeto com status pronto.
		StatusPedido os2 = StatusPedido.valueOf("ENTREGUE"); //instanciado outro objeto, porém em forma de string.
		//tem que ser igual está escrito no pacote 'enum'.
		System.out.println(os1);
		System.out.println(os2);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				ENUMERAÇÃO
	° É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas.
	° Palavra chave em Java: 'enum'.
	° Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador
	° JAVA DOC -> https://docs.oracle.com/javase/8/docs/api/java/lang/Enum.html
*/