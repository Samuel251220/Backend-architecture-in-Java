package upeu.edu.pe.mauricio.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TMV_COCHERA_PROPIETARIO")
public class CocheraPropietario {

	@Id
	@Column(name="ID_COCHERA_PROPIETARIO", length=50)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcp;

	public CocheraPropietario() {

	}

	public CocheraPropietario(int idcp) {
		this.idcp = idcp;
	}
	
	
	public int getIdcp() {
		return idcp;
	}

	public void setIdcp(int idcp) {
		this.idcp = idcp;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "fk_cochera")
	private Cochera cochera;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "fk_propietarioPropiedad")
	private PropietarioPropiedad propietarioPropiedad;

	public Cochera getCochera() {
		return cochera;
	}

	public void setCochera(Cochera cochera) {
		this.cochera = cochera;
	}

	public PropietarioPropiedad getPropietarioPropiedad() {
		return propietarioPropiedad;
	}

	public void setPropietarioPropiedad(PropietarioPropiedad propietarioPropiedad) {
		this.propietarioPropiedad = propietarioPropiedad;
	}

	@Override
	public String toString() {
		return "CocheraPropietario [idcp=" + idcp + ", cochera=" + cochera + ", propietarioPropiedad="
				+ propietarioPropiedad + "]";
	}
	
	
	
	
}
