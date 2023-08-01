package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_72_74 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/* PROBLEMA EXEMPLO - SOLVED!
1. Um site de internet registra um log de acessos dos usuários. Um registro de log consiste no nome de usuário(apenas uma palavra) e o instante em
que o usuário acessou o site no padrão ISO 8601, separados por espaço, conforme exemplo. Fazer um programa que leia o log de acessos a partir de um
arquivo, e daí informe quantos usuários distintos acessaram o site.

2. Em um portal de cursos online, cada usuário possui um código único, representado por um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser. Assim, o número de alunos de um
instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu núemro total de alunos.
O programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a quantidade total de alunos dele.
*/