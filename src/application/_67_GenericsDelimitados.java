package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto4;
import services.ServicoCalculo;

public class _67_GenericsDelimitados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto4> lista = new ArrayList<>();
		String path = "C:\\temp\\out.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String linha = br.readLine();
			while(linha != null) {
				String[] fields = linha.split(",");
				lista.add(new Produto4(fields[0], Double.parseDouble(fields[1])));
				linha = br.readLine();
			}
			
			Produto4 x = ServicoCalculo.max(lista);
			System.out.println("Máximo: ");
			System.out.println(x);
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*PROBLEMA EXEMPLO
	° Uma empresa de consultoria deseja avaliar a performance de produtos, funcionários, dentre outras coisas. Um dos cálculos que ela precisa é 
encontrar o maior dentre um conjunto de elementos. Fazer um programa que leia um conjunto de produtos a partir de um arquivo, conforme exemplo, e
depois mostre o mais caro deles.
*/