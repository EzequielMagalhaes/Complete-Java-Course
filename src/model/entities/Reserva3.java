//	USADO NA CLASSE _54_ExcecoesPersonalizadas_Pt3 //
package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import model.exceptions.DomainException;

public class Reserva3 {
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva3(Integer numeroQuarto, Date checkIn, Date checkOut) throws DomainException {
		if(!checkOut.after(checkIn)) {
			throw new DomainException("A data de 'check-out' deve ser posterior à data de 'check-in'");
		}
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
	public void atualizarDatas(Date checkIn, Date checkOut) throws DomainException {
		Date agora = new Date();
		if(checkIn.before(agora) || checkOut.before(agora)) {
			throw new DomainException("As datas de reserva para atualização devem ser datas futuras.");
		}
		if(!checkOut.after(checkIn)) {
			throw new DomainException("A data de 'check-out' deve ser posterior à data de 'check-in'");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
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