package application;

import java.util.Locale;
import java.util.Scanner;

public class _32_For_Each {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String [] vect = new String [] {"Jesus","Maria","José"};
		for(int i = 0; i < vect.length; i++){
			System.out.println(vect[i]);
		}
		System.out.println("-----------------");
//	COMO SE Lê: "Para cada objeto "obj" contido no vetor "vect", faça...
		for(String obj : vect){ // o 'for' percorre todos os elementos do vetor "vect", chamando cada elemento de "obj"
			System.out.println(obj);
		}
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				Laço 'for each'
*	° Sintaxe:
*		for(Tipo apelido : coleção){
*			<comando1>
*			<comando2>
*		}
*/