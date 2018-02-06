package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Item {
	
	@Id
	@GeneratedValue
	private int idItems;
	
	private Double largo;
	private Double ancho;
	
	@ManyToOne()
	@JoinColumn(name = "nro_Orden")
	private Orden orden;
	
	@ManyToOne()
	@JoinColumn(name = "idProducto")
	private Producto producto;
	
	public Item() {
		
	}
	
	
	public Item(int idItems, Double largo, Double ancho, Orden orden, Producto producto) {
		super();
		this.idItems = idItems;
		this.largo = largo;
		this.ancho = ancho;
		this.orden = orden;
		this.producto = producto;
	}

	public int getIdItems() {
		return idItems;
	}

	public void setIdItems(int idItems) {
		this.idItems = idItems;
	}

	public Double getLargo() {
		return largo;
	}

	public void setLargo(Double largo) {
		this.largo = largo;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	
}
