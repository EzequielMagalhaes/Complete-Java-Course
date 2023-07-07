package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class _64_InterfaceComparable {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		String path = "c:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String nome = br.readLine();
			while(nome != null) {
				lista.add(nome);
				nome = br.readLine();
			}
			Collections.sort(lista);// Método para organizar a lista.
			for (String s : lista) {
				System.out.println(s);
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*EXEMPLO TESTE
1. Fazer um programa para ler um arquivo contendo nomes de pessoas (um nome por linha), armazenando-os em listas. Depois, ordenar os dados dessa
lista e mostra-los ordenadamente na tela. NOTA : o caminho do arquivo pode ser informado "hardcode" -> pode colocar direto no código fonte.

2. Faça um programa para ler um arquivo contendo funcionários(nome e salário) no formato .csv, armazenando-os em uma lista. Depois, ordenar a lista
por nome e mostrar o resultado em tela.
*/ 