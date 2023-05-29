//	USADO NA CLASSE _18_CriandoClasseComAtributos e _19_ReaproveitamentoEDelegacao//
package entities;

public class Triangulo {
	// atributos da classe
	public double a; // atributo 1
	public double b; // atributo 2
	public double c; // atributo 3
	
	/*	prefixo 'public' indica que o atributo ou método pode ser usado em outros arquivos.
		'double' é o tipo de dado que o método retorna (se o não retorna nada, usa-se a palavra 'void').	*/
	public double area(){
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}