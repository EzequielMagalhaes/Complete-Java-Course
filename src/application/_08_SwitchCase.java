package application;

import java.util.Locale;
import java.util.Scanner;

public class _08_SwitchCase {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o numero do dia da semana?");
		int x = sc.nextInt();
		String dia = new String();
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			
			break;
		default:
			dia = "Inváido";
			break;
		}
		if(x > 7) {
			System.out.println("A semana só tem 7 dias!");
		}else {			
			System.out.println("Dia da semana: " + dia);
		}
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}

	/*	USANDO IF - ELSE
		if(x == 1) {
			
		}else if(x == 2){
			dia = "Segunda";
			System.out.println(dia);
		}else if(x == 3){
			dia = "Terça";
			System.out.println(dia);
		}else if(x == 4){
			dia = "Quarta";
			System.out.println(dia);
		}else if(x == 5){
			dia = "Quinta";
			System.out.println(dia);
		}else if(x == 6){
			dia = "Sexta";
			System.out.println(dia);
		}else if (x == 7){
			dia = "Sabado";
			System.out.println(dia);
		}else{
			System.out.println("A semana só tem 7 dias!");
		}
	*/