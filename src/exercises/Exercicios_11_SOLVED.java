package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_11_SOLVED {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	//BONUS
		int x = 0;
		int y = 4;
		
		while ( x < 3 ) {
			y += 2;
			x += 1;
			System.out.printf("A variável 'x': %d%nA variável 'y': %d%n%n", x, y);
		}
		System.out.printf("A variável final de 'x': %d%nA variável final de 'y':%d%n%n", x, y);
		System.out.println("==========================================");
	//1
		System.out.printf("EXERCÍCIO 1%n");
		System.out.println("Insira a senha: ");
		int senha = sc.nextInt();
		while(senha != 2002){
			System.out.println("Senha Inválida");
			System.out.println("Insira a senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Senha correta! Login concluído.");
		System.out.println("Bem-vindo ao sistema!");
		System.out.println("==========================================");
	//2
		System.out.printf("EXERCÍCIO 2%n");
		
		System.out.println("Insira o valor da coordenada 'X': ");
		double X = sc.nextDouble();
		System.out.println("Insira o valor da coordenada 'Y': ");
		double Y = sc.nextDouble();
		
		while(X != 0 && Y != 0) {
				//DETERMINAR O QUADRANTE
				if(X == 0 && Y == 0){
					System.out.println("Origem.");
				}else if(X > 0 && Y > 0){
					System.out.println("Quadrante Q1.");
				}else if(X < 0 && Y > 0){
					System.out.println("Quadrante Q2.");
				}else if(X < 0 && Y < 0){
					System.out.println("Quadrante Q3.");
				}else{
					System.out.println("Quadrante Q4.");
				}
			System.out.println("O valor das coordenadas 'X' e 'Y' é diferente de zero.");
			System.out.println("Insira novamente o valor da coordenada 'X': ");
			X = sc.nextDouble();
			System.out.println("Insira novamente o valor da coordenada 'Y': ");
			Y = sc.nextDouble();
		}
		System.out.println("==========================================");
	//3
		System.out.printf("EXERCÍCIO 3%n");
		int codigo = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(codigo != 4){
			System.out.println("====================================");
			System.out.println("Qual o combusítvel deseja abastecer?");
			System.out.println("1 - Álcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - Para sair");
			System.out.println("====================================");
			codigo = sc.nextInt();
			if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            }else if (codigo != 4){
    			System.out.println("Código inválido! Tente novamente.");
            }
            	System.out.println("MUITO OBRIGADO!");
				System.out.println("TABELA DE CLIENTES");
				System.out.println("====================================");
				System.out.printf("Álcool: %d%n",alcool);
				System.out.printf("Gasolina: %d%n",gasolina);
				System.out.printf("Diesel: %d%n",diesel);
            }
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCÍCIOS
1. Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*
2. Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*
3. Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
*/