package pojo;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Ordenes")
public class Orden {

	@Id
	@GeneratedValue
	private int nro_Orden;
	private Timestamp fecha_orden;

	@ManyToOne()
	@JoinColumn(name = "idCliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "idEstado")
	private Estado estado;

	@OneToMany(mappedBy = "orden")
	private List<Item> items;

	public Orden() {

	}

	public Orden(int nro_Orden, Timestamp fecha_orden, Cliente cliente, Estado estado, List<Item> items) {
		super();
		this.nro_Orden = nro_Orden;
		this.fecha_orden = fecha_orden;
		this.cliente = cliente;
		this.estado = estado;
		this.items = items;
	}

	public int getNro_Orden() {
		return nro_Orden;
	}

	public void setNro_Orden(int nro_Orden) {
		this.nro_Orden = nro_Orden;
	}

	public Timestamp getFecha_orden() {
		return fecha_orden;
	}

	public void setFecha_orden(Timestamp fecha_orden) {
		this.fecha_orden = fecha_orden;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	

}
