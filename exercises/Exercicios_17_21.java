import java.util.Locale;
import java.util.Scanner;

import entities.FuncionarioExercicios;
import entities.RetanguloExercicios;

public class Exercicios_17_21 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
/*1
		RetanguloExercicios ret = new RetanguloExercicios();
		
		System.out.println("Digite o tamanho da largura do retângulo");
		ret.altura = sc.nextDouble();
		System.out.println("Digite o tamanho da altura do retângulo");
		ret.largura = sc.nextDouble();
		
		System.out.printf("Área: %.2f \n", ret.area());
		System.out.printf("Perímetro: %.2f \n", ret.perimetro());
		System.out.printf("Diagonal: %.2f \n", ret.diagonal());
*/
/*2
		FuncionarioExercicios Func = new FuncionarioExercicios();
		System.out.println("Insira o nome do funcionário: ");
		Func.nome = sc.nextLine();
		System.out.println("Insira o ser respectivo salário: ");
		Func.SalarioBruto = sc.nextDouble();
		System.out.println("Insira o valor a ser pago de imposto: ");
		Func.Imposto = sc.nextDouble();
		System.out.println("Insira a porcentagem de aumento de salário: ");
		double porcentagem = sc.nextDouble();
		Func.reajusteSalario(porcentagem);
		
		System.out.println("O " + Func.nome + " recebeu R$: " + Func.SalarioBruto + " e precisa pagar R$: " + Func.Imposto);
		System.out.println("Dados atualizados: "+ Func);
*/
//3
		
		
		
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXERCÍCIOS
1. Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida mostrar na tela o valor de sua área, perímetro e diagonal.
Usar uma classe como mostrado no projeto. 
*
2. Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário com base em
uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
*
3. Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo
e terceiro valem 35 cada). Ao final, mostrar o qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, 
em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Deve criar uma classe 'Estudante' 
para resolver os problemas.
*/