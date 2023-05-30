package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class _44_Heranca {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
// A classe'ContaEmpresarial' pode chamar as mesmas funções que a classe 'Conta'.
/*		ContaEmpresarial conta = new ContaEmpresarial();
		conta.getSaldo();*/
		Conta conta0 = new Conta(1001,"Alex", 0.0);
		ContaEmpresarial cntEmp = new ContaEmpresarial(1002,"Maria", 0.0, 500.0); //n° da conta, titular, saldo, limite de emprestimo.
		
		//UPCASTING
// não dá erro ao atribuir um objeto do tipo 'ContaEmpresarial' para uma do tipo 'Conta'
// pois uma 'ContaEmpresarial' ou 'ContaPoupança' não deixam de ser uma 'Conta'.
		Conta conta1 = cntEmp;
		Conta conta2 = new ContaEmpresarial(1003,"Bob", 0.0, 200.0);
		Conta conta3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
// nem sempre da certo. Só vai aparecer o erro, em tempo de execução...quando rodar o programa.
		ContaEmpresarial conta4 = (ContaEmpresarial)conta2;
		conta4.Emprestimo(100.0);
		
// Se o que estiver na variável 'conta3' for um objeto que seja instância de 'ContaEmpresarial'... ai sim pode fazer o casting.
// Esse if falhou!
		if(conta3 instanceof ContaEmpresarial) {
			ContaEmpresarial conta5 = (ContaEmpresarial)conta3;
			conta5.Emprestimo(200.0);
			System.out.println("Empréstimo!");
		}
		
		if(conta3 instanceof ContaPoupanca) {
			ContaPoupanca conta5 = (ContaPoupanca)conta3;
			conta5.atualizarSaldo();
			System.out.println("Atualizado!");
		}
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*					HERANÇA
	° É um tipo de associação que permite que uma classe herde *TODOS* dados e comportamentos de outra.
	° Definições importantes.
	° Vantagens: 
		- Reuso.
		-Polimorfismo.
	° Sintaxe:
		- "class A extends B"
==========================================================================
	° Relação "é-um" -> a subclasse "é uma" classe, porém com algo mais.
	° Generalização/Especialização. -> A superclasse é a genérica(generalização) e a subclasse é a que tem atributos unicos e específicos(especificação).
	° Superclasse(classe base) / Subclasse(classe derivada).
	° Herança / extensão.
	° Herança é uma associação entre classes(e não entre objetos).
==========================================================================
	° Upcasting:
		- Casting da subclasse para superclasse.
		- Uso comum: polimorfismo.
	° Downcasting:
		- Casting da superclasse para subclasse.
		- Palavra 'instanceof'.
		- Uso comum: métodos que recebem parâmetros genéricos(ex:Equals).
==========================================================================
	° Sobreposição:
		- É a implementação de um método de uma superclasse na subclasse.
		- É fortemente recomendável usar a anotação "@Override" em um método sobrescrito
			. Facilita a leitura e compreenção do código.
			. Aviso ao compilador(boa prática).
*/