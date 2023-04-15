import java.util.Locale;
import java.util.Scanner;

public class _16_Funcoes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		/*		USANDO IF ELSE
		if(a > b && a > c) {
			System.out.println("Higher = " + a);
		}else if(b > c){
			System.out.println("Higher = " + b);
		}else{
			System.out.println("Higher = " + c);
		}
		*/
		
		//		USANDO FUNÇÕES PERSONALIZADAS
		int higher = max(a,b,c);
		showResult(higher);
		
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
	
	public static int max(int x,int y, int z){
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > z){
			aux = y;
		}else{
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value){
		System.out.println("Higher = " + value);
	}
}