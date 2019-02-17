package upeu.edu.pe.mauricio.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="THS_COCHERA")
public class Cochera implements Serializable{

	@Id
	@Column(name="ID_COCHERA", length=50)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idc;	
	
	@Column(name="NU_COCHERA", length=50)
	private String numeroC;
	
	@Column(name="ME_PARTICIPACION")
	private double participacion;
	
	@Column(name="ES_COCHERA", length=1)
	private double estadoC;	
	
	
	public Cochera() {
		
	}

	public Cochera(int idc) {
		this.idc = idc;
	}
	
	
	public int getIdc() {
		return idc;
	}

	public void setIdc(int idc) {
		this.idc = idc;
	}

	public String getNumeroC() {
		return numeroC;
	}

	public void setNumeroC(String numeroC) {
		this.numeroC = numeroC;
	}

	public double getParticipacion() {
		return participacion;
	}

	public void setParticipacion(double participacion) {
		this.participacion = participacion;
	}

	public double getEstadoC() {
		return estadoC;
	}

	public void setEstadoC(double estadoC) {
		this.estadoC = estadoC;
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
	
	

	@Override
	public String toString() {
		return "Cochera [idc=" + idc + ", numeroC=" + numeroC + ", participacion=" + participacion + ", estadoC="
				+ estadoC + ", cocheraPropietario=" + cocheraPropietario + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
