package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class _68_TiposCuringa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printLista(myInts);
		
		List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
		printLista(myStr);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		}
	
		public static void printLista(List<?> lista) {
			for(Object obj : lista) {
				System.out.println(obj);
			}
		}		
}
/*			GENERICS SÃO INVARIANTES
	° List<Object> não é supertipo de qualquer tipo de lista: 
		
		List<Object> myObjs = new ArrayList<>();
		List<Integer> myNumbers = new ArrayList<>();
		myObjs = mynNumbers; // da erro de compilação.
	
	° O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
	
		List<?> myObjs = new ArrayList<>();
		List<Integer> myNumbers = new ArrayList<>();
		myObjs = mynNumbers;
		
	° Com tipos curinga da pra fazer métodos que recebem um genérico de "qualquer tipo".
	° Porém não é possível adicionar dados a uma coleção de tipo coringa.
		- O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.
*/