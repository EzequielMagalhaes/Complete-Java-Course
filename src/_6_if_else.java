import java.util.Scanner;

public class _6_if_else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if(hora >= 24){
			System.out.println("O relógio só tem 24 horas besta, olha direito!");
		}else if(hora < 12){
			System.out.println("Bom dia!");
		}else if(hora < 18){
			System.out.println("Boa tarde!");
		}else{
			System.out.println("Boa noite!");
		}
		sc.close();
	}
}