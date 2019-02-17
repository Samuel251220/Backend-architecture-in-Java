package upeu.edu.pe.mauricio.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TMV_PROPIETARIO_PROPIEDAD")
public class PropietarioPropiedad implements Serializable{
	
	@Id
	@Column(name="ID_PROPIETARIO_PROPIEDAD", length=50)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpp;
	
	
	public PropietarioPropiedad() {

	}

	public PropietarioPropiedad(int idpp) {
		this.idpp = idpp;
	}

	public int getIdpp() {
		return idpp;
	}

	public void setIdpp(int idpp) {
		this.idpp = idpp;
	}
	

	@OneToMany(mappedBy = "ID_COCHERA_PROPIETARIO",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private List<CocheraPropietario> cocheraPropietario;	
	
	public List<CocheraPropietario> getCocheraPropietario() {
		return cocheraPropietario;
	}

	public void setCocheraPropietario(List<CocheraPropietario> cocheraPropietario) {
		this.cocheraPropietario = cocheraPropietario;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
}
