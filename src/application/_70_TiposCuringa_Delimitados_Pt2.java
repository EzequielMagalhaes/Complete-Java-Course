package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class _70_TiposCuringa_Delimitados_Pt2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles,myObjs);
		printList(myObjs);
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
	}
	
	public static void copy(List<? extends Number> fonte, List<? super Number> destino) {
		for(Number numero : fonte) {
			destino.add(numero);
		}
	}
	
	public static void printList(List<?> lista) {
		for(Object obj : lista) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}