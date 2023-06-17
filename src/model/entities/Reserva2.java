//	USADO NA CLASSE _53_ExcecoesPersonalizadas_Pt2 //
package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva2 {
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva2(Integer numeroQuarto, Date checkIn, Date checkOut) {
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public long duracao() {
		long diferenca = checkOut.getTime() - checkIn.getTime(); //diferença entra as duas datas em milissegundos.
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS); //converção do valor da 'diferença', que estava em milissegundos para dias.
	}
	public String atualizarDatas(Date checkIn, Date checkOut) {
		Date agora = new Date();
		if(checkIn.before(agora) || checkOut.before(agora)) {
			return "As datas de reserva para atualização devem ser datas futuras.";
		}
		if(!checkOut.after(checkIn)) {
			return "A data de 'check-out' deve ser posterior à data de 'check-in'";
		}
		//Caso execute, sem passar por nenhum dos dois erros acima, ai o programa passa pela lógica abaixo de atualizar as datas.
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null; // Se retornar nulo, é porque não houve nenhum erro.
	}
	//Método 'toString()' é uma sobreposição, então sempre colocar o override no toString.
	@Override
	public String toString() {
		return "Quarto "
			+ numeroQuarto
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ " " + duracao()
			+ " noites.";
	}
}