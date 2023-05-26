package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Funcionario;
import entities.enums.NivelFuncionario;

public class _42_Composicao {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Insira o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Insira os dados do trabalhador: ");
		System.out.println("Nome: ");
		String nomeFuncionario = sc.nextLine();
		System.out.println("Nível: ");
		String nivelFuncionario = sc.nextLine();
		System.out.println("Salário base: ");
		double salarioBase = sc.nextDouble();
		Funcionario funcionario = new Funcionario(nomeFuncionario,NivelFuncionario.valueOf(nivelFuncionario),salarioBase,new Departamento(nomeDepartamento));
//		Instancia um novo objeto do tipo Funcionario, os dados deese objeto é o nome que foi inserida, uma instância de nível que foi inserida e o valor de salário base que foi inserido.
//		Associado a esse objeto, vai ter um outro objeto do tipo departamento, onde o nome desse departamento, vai ser o nome inserido anteriormente.
		
		System.out.println("Quantos contratos para esse trabalhador? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
			System.out.println("Insira os dados do #" + i + " contrato: ");
			System.out.println("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.println("Duração(Horas): ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato,valorPorHora,horas); //Instanciando o contrato.
			funcionario.addContrato(contrato); //Associa o contrato com o trabalhador.
		}
		System.out.println(); //pular linha.
		System.out.println("Insira o mês e ano para calcular a renda (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2)); //O mes, equivale apenas aos dois primeiros digitos da string no modelo 'MM/yyyy'.
		int ano = Integer.parseInt(mesEAno.substring(3)); //O resto equivale ao ano. 
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.println("Renda de " + mesEAno + ": " + String.format("%.2f", funcionario.renda(ano, mes)));		
		System.out.println();
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}
/*				Composição 
	° É um tipo de associação que permite que o objeto contenha outro.
	° Relação "tem-um" ou "tem-varios".
	° Vantagens:
		- Organização: divisão de responsabilidades.
		- Coesão.
		- Flexibilidade.
		- Reuso.
	° Nota: embora o símbolo UML para composição(todo-parte) seja o diamante preto, neste contexto estamos chamando de composição
	qualquer associação tipo "tem-um" e "tem-vários".
*/