package upeu.edu.pe.mauricio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="THS_PROPIETARIO")
public class Propietario implements Serializable{

	@Id
	@Column(name="ID_PROPIETARIO", length=50)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpt;
	
	@Column(name="ES_PROPIETARIO", length=1)
	private char estadopt;

	public Propietario() {
		super();
	}

	public Propietario(int idpt) {
		super();
		this.idpt = idpt;
	}

	public int getIdpt() {
		return idpt;
	}

	public void setIdpt(int idpt) {
		this.idpt = idpt;
	}

	public char getEstadopt() {
		return estadopt;
	}

	public void setEstadopt(char estadopt) {
		this.estadopt = estadopt;
	}

	@Override
	public String toString() {
		return "Propietario [idpt=" + idpt + ", estadopt=" + estadopt + "]";
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
