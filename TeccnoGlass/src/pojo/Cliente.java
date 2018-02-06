package pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Clientes")
public class Cliente {
	
	@Id
	@GeneratedValue
	private int idCliente;
	private String nombre;
	private int telefono;
	private String direccion;
	private String nacionalidad;
	private String correo;	
	
	
	public Cliente(){
		
	}
	
	public Cliente(int idCliente, String nombre, int telefono, String direccion, String nacionalidad, String correo,
			List<Orden> ordens) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nacionalidad = nacionalidad;
		this.correo = correo;
		this.ordens = ordens;
	}



	@OneToMany(mappedBy = "cliente")
	private List<Orden> ordens;


	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Orden> getOrdens() {
		return ordens;
	}

	public void setOrdens(List<Orden> ordens) {
		this.ordens = ordens;
	}
	
}
