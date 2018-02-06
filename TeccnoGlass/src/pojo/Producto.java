package pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Productos")
public class Producto {

	@Id
	@GeneratedValue
	private int idProducto;

	private String nombre;

	@OneToMany(mappedBy = "producto")
	public List<Item> items;

	public Producto() {

	}

	public Producto(int idProducto, String nombre, List<Item> items) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.items = items;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	

}
