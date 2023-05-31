package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import entities.Comentario;
import entities.Postagem;

public class _43_StringBuilder {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem!");
		Comentario c2 = new Comentario("Uau, isso é incrível!");
		Postagem p1 = new Postagem(sdf.parse("29/05/2023 14:50:30"), // momento.
					"Viajando para Nova Zelândia", // titulo
					"Eu estou indo visitar um país maravilhoso!", // conteudo
					12); // likes
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Que a força esteja com você");
		Postagem p2 = new Postagem(sdf.parse("29/05/2023 15:04:50"),
					"Boa noite felas",
					"Até amanhã",
					30);
		p2.addComentario(c3);
		p2.addComentario(c4);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("===================================================================");
		System.out.println("Programa terminou!");
		System.out.println("Até a próxima =)");
		sc.close();
	}
}