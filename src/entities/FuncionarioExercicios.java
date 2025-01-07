package entities;

public class FuncionarioExercicios {
	public String nome;
	public double SalarioBruto;
	public double Imposto;
	
	public double salarioLiquido() {
		return SalarioBruto - Imposto;
	}
	
	public void reajusteSalario(double porcentagem) {
		SalarioBruto += SalarioBruto * porcentagem / 100;
	}
	
	public String toString() {
		return "Funcionário: " + nome + ", R$: " + String.format("%.2f", salarioLiquido());
	}
}