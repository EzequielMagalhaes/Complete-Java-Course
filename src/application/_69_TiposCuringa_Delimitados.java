package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.Circulo3;
import entities.Forma2;
import entities.Retangulo3;

public class _69_TiposCuringa_Delimitados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Forma2> myFormas = new ArrayList<>();
		myFormas.add(new Retangulo3(3.0, 2.0));
		myFormas.add(new Circulo3(2.0));
		System.out.println("Area total: " + areaTotal(myFormas));
		
		List<Circulo3> myCirculos = new ArrayList<>();
		myCirculos.add(new Circulo3(4.0));
		myCirculos.add(new Circulo3(3.0));
		System.out.println("Area total: " + areaTotal(myCirculos));

		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
	}
	public static double areaTotal(List<? extends Forma2> lista) {
		double soma = 0.0;
		for (Forma2 f : lista) {
			soma += f.area();
		}
		return soma;
	}
}
/*PROBLEMA EXEMPLO
	° Fazer um método retornar a soma das áreas de uma lista de figuras.
*/