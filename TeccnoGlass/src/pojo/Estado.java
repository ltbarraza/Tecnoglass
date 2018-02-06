package pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Estados")
public class Estado {
	
	@Id
	@GeneratedValue
	private int idEstado;
	
	private String estado;
		
	@OneToMany(mappedBy = "estado")
	private List<Orden> ordens;
	
	
	public Estado(){
		
	}


	public Estado(int idEstado, String estado, List<Orden> ordens) {
		super();
		this.idEstado = idEstado;
		this.estado = estado;
		this.ordens = ordens;
	}


	public int getIdEstado() {
		return idEstado;
	}


	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public List<Orden> getOrdens() {
		return ordens;
	}


	public void setOrdens(List<Orden> ordens) {
		this.ordens = ordens;
	}
	
	
}

