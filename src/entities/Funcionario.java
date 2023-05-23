package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.NivelFuncionario;

public class Funcionario {
	private String nome;
	private NivelFuncionario nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>(); //não inclui ele no construtor.
	// Deve instanciar a lista por padrão na classe. Por isso já coloca o 'ArrayList<>()' na declaração do atributo.
	
	public Funcionario() {
	}

	public Funcionario(String nome, NivelFuncionario nivel, Double salarioBase, Departamento departamento) { // gera o construtor sem a lista. Ela vai ser instanciada antes na própria linha.
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelFuncionario getNivel() {
		return nivel;
	}

	public void setNivel(NivelFuncionario nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	public void setContratos(List<ContratoHora> contratos) {
		this.contratos = contratos;
	}	
	// Métodos responsáveis por fazer ou desfazer a associação entre o trabalhador e o contrato.
	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato); // adiciona contrato na lista.
	}
	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato); // remove contrato da lista.
	}
}