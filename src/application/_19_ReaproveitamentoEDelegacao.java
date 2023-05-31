package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class _19_ReaproveitamentoEDelegacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo(); // Instanciando o objeto X
		y = new Triangulo(); // Instanciando o objeto Y
		System.out.println("Determine as TRÊS medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c= sc.nextDouble();
		System.out.println("Determine as TRÊS medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaX = x.area(); // o cálculo da area agora é feito na classe triangulo
		double areaY = y.area(); // e pra usá-lo basta chamar a função 'area()'.
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		if(areaX > areaY) {
			System.out.println("A maior área é a do: 'X'");
		}else if(areaX == areaY){
			System.out.println("A área dos triângulos é igual !");
		}else{
			System.out.println("A maior área é a do: 'Y'");
		}
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}

/* 			QUAIS OS BENEFÍCIOS DE SE CALCULAR A ÁREA DE UM TRIÂNGULO
 * 				POR MEIO DE UM MÉTODO DENTRO DA CLASSE 'Triangle'?
 * 
 * ° Reaproveitamento de código > eliminei o código repetido (cálculo da áreas dos triângulos X e Y) no programa principal.
 * 
 * ° Delegação de responsabilidade > quem deve ser responsáevl por saber como calcular a área de um triângulo é o próprio triângulo.
 * 	 A lógica do cálculo da área não deve estar em outro lugar. >>> Isso se chama 'COESÃO'.
 * 
 * 
 */