/*				CLASSES E MÉTODOS FINAL 
	° Palavra chave: *final*
	° Classe:
		- Evita que a classe seja herdada.
			'public final class ContaPoupanca{
			}'
	° Método:
		- Evita que o método sob seja sobreposto.
				PRA QUE?
	° Segurança: dependendo das regras de negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que um método não seja sobreposto.
		- Geralmente convém acrescentar *final* em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada para inconcistências.
	° Performance: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução.
		- Exemplo clássico: String
*/