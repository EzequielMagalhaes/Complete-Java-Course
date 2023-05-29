//	USADO NA CLASSE _41_Enumeracoes //
package entities;

import java.util.Date;
import entities.enums.StatusPedido;

public class Pedido {
	private Integer id;
	private Date instante;
	private StatusPedido status;

	public Pedido() {
	}
	
	public Pedido(Integer id, Date instante, StatusPedido status) {
		this.id = id;
		this.instante = instante;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id= " + id + ", instante= " + instante + ", status= " + status + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getinstante() {
		return instante;
	}

	public void setinstante(Date instante) {
		this.instante = instante;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
}