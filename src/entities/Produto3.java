//	NOVA CLASSE PARA DEMONSTRAR OS GETTERS E SETTERS //
package entities;

public class Produto3{
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto3(){
	}
	
	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public double getPreco(){
		return preco;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}

	public int getQuantidade(){
		return quantidade;
	}

	public void addProdutos(int quantidade){
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade){
		this.quantidade -= quantidade;
	}
	
	public double totalEmEstoque(){
		return preco * quantidade;
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
