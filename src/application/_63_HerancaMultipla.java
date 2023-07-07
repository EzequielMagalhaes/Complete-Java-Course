package application;

import java.util.Locale;

import devices.ComboDispositivos;
import devices.ImpressoraConcreta;
import devices.ScannerConcreto;

public class _63_HerancaMultipla {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ImpressoraConcreta i = new ImpressoraConcreta("1080");
		i.processarDoc("Minha carta");
		i.imprimir("Minha carta");
		
		ScannerConcreto s = new ScannerConcreto("2003");
		s.processarDoc("Meu email");
		System.out.println("Resultado do scan: " + s.scan());
		
		ComboDispositivos cd = new ComboDispositivos("2081");
		cd.processarDoc("Meu texto");
		cd.imprimir("Meu texto");
		System.out.println("Resultado do scan: " + cd.scan());
		
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
	}
}
/*				HERANÇA MÚLTIPLA
	° A herança múltipla pode gerar o problema do diamante: uma ambiguidade causada pela existência do mesmo método em mais de uma superclasse.
	° Herança múltipla não é permitida na maioria das linguagens.
		- obs: Para desviar do problema do diamante, é possivel usar interfaces. Assim permitindo que a classe implemente mais de uma interface.
	° Isso não é herança múltipla, pois não há reuso na relação entre 'ComboDispositivos' e as interfaces 'Scanner' e 'Impressora'.
	° ComboDispositivo não herda, mas sim implementa as interfaces(cumpre contrato).
*/