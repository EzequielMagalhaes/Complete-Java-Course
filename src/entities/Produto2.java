//	NOVA CLASSE PARA DEMONSTRAR O MÉTODO CONSTRUTOR //
package entities;

public class Produto2 {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto2(){ // Caso queira manter o construtor padrão e não usar algum personalizado.
	}
	
	public Produto2(String nome, double preco, int quantidade){
		this.nome = nome; //" this.nome " está acessando o nome do 'objeto'. Já o " nome " está acessando a variável local do 'construtor'.
		this.preco = preco;
		this.quantidade = quantidade;
	}
	//SOBRECARGA
	public Produto2(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public double totalEmEstoque(){
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade){
		this.quantidade += quantidade; // usa o " this " , que é uma palavra reservada que significa uma autoreferência para o objeto.
	}
	
	public void removerProdutos(int quantidade){
		this.quantidade -= quantidade;
	}
	
	public String toString(){
		return nome
			+ ", R$: "
			+ String.format("%.2f",preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: R$: "
			+ String.format("%.2f",totalEmEstoque());
	}
}
/*					PALAVRA 'THIS'
	° É uma referência para o próprio objeto.
	° Usos comuns:
		- Diferenciar atributos de variáveis locais.
		- Passar o próprio objeto como argumento na chamada de um método ou construtor.
*/