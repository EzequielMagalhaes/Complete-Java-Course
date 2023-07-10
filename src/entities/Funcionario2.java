//	USADO NA CLASSE _64_InterfaceComparable //
package entities;

public class Funcionario2 implements Comparable<Funcionario2> {
	private String nome;
	private Double salario;
	public Funcionario2(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public int compareTo(Funcionario2 outro) {
		return -nome.compareTo(outro.getNome()); //Organizar por nomes.
		//return (-)salario.compareTo(outro.getSalario()); //Organizar por salário.
	}
}