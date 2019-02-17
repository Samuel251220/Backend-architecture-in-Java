package upeu.edu.pe.mauricio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="THS_GRUPO")
public class Grupo implements Serializable{

	@Id
	@Column(name="ID_GRUPO", length=50)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idg;
	
	@Column(name="NO_GRUPO", length=50)
	private String nombreG;

	public Grupo() {
		
	}

	public Grupo(int idg) {
		this.idg = idg;
	}

	public int getIdg() {
		return idg;
	}

	public void setIdg(int idg) {
		this.idg = idg;
	}

	public String getNombreG() {
		return nombreG;
	}

	public void setNombreG(String nombreG) {
		this.nombreG = nombreG;
	}

	@Override
	public String toString() {
		return "Grupo [idg=" + idg + ", nombreG=" + nombreG + "]";
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
