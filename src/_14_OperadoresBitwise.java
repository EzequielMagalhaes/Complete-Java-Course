import java.util.Locale;
import java.util.Scanner;

public class _14_OperadoresBitwise {
	public static void main(String[] args) { 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//														 >
		int n1 = 89; // representação binaria = 0101 1001  >	& -> 0001 1000 (24)
//															 >	| -> 0111 1101 (125)
		int n2 = 60; // representação binaria = 0011 1100  >	^ -> 0110 0101 (101)
//														 >
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}

/*	 		OPERADORES BITWISE
 *  & -> Operação "E" bit a bit.
 *  | -> Operação "OU" bit a bit.
 *  ^ -> Operação "OU-Exclusivo" bit a bit.
 */