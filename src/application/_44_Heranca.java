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
		ContaPoupanca cntPoup = new ContaPoupanca(1001,"Maria", 1000.0, 0.01); //n° da conta, titular, saldo, limite de emprestimo.
		ContaEmpresarial cntEmp = new ContaEmpresarial(1002,"Zekiel", 1000.0, 500.0);
		Conta conta0 = new Conta(1003,"Alex", 1000.0);		
		
		// UPCASTING //
// não dá erro ao atribuir um objeto do tipo 'ContaEmpresarial' para uma do tipo 'Conta'
// pois uma 'ContaEmpresarial' ou 'ContaPoupança' não deixam de ser uma 'Conta'.
		Conta conta1 = cntPoup;
		Conta conta2 = cntEmp;
		Conta conta3 = new ContaEmpresarial(1004,"Bob", 0.0, 200.0);
		Conta conta4 = new ContaPoupanca(1005, "Anna", 0.0, 0.01);
		
		// DOWNCASTING //
// nem sempre da certo. Só vai aparecer o erro, em tempo de execução...quando rodar o programa.
		ContaEmpresarial conta5 = (ContaEmpresarial)conta3;
		conta5.Emprestimo(100.0);
		
// Se o que estiver na variável 'conta3' for um objeto que seja instância de 'ContaEmpresarial'... ai sim pode fazer o casting.
// Esse if falhou!
		if(conta4 instanceof ContaEmpresarial) {
			ContaEmpresarial conta6 = (ContaEmpresarial)conta4;
			conta6.Emprestimo(200.0);
			System.out.println("Empréstimo!");
		}
		
		if(conta4 instanceof ContaPoupanca) {
			ContaPoupanca conta7 = (ContaPoupanca)conta4;
			conta7.atualizarSaldo();
			System.out.println("Atualizado!");
		}
		
		// SOBREPOSIÇÃO //
		// Conta que tem a taxa de 5.00 no saque.
		conta0.saqueSaldo(200.0);
		System.out.println(conta0.getSaldo());
		
		// Conta que não tem taxa no saque.
		conta1.saqueSaldo(200.0);
		System.out.println(conta1.getSaldo());
		
		// Conta que tem o desconto da taxa de 5.00 que é a lógica da classe 'Conta', depois descontar mais 2.0 no saque.
		conta2.saqueSaldo(200.0);
		System.out.println(conta2.getSaldo());
		
		
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
			
	° Super :
		- É possível chamar a implementação da superclasse usando a palavra "super".
*/