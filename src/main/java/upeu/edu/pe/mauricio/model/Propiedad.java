package upeu.edu.pe.mauricio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="THS_PROPIEDAD")
public class Propiedad implements Serializable{

	@Id
	@Column(name="ID_PROPIEDAD", length=50)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpd;
	
	@Column(name="NU_PROPIEDAD", length=50)
	private int numero;
	
	@Column(name="TI_PROPIEDAD", length=100)
	private String tipo;
	
	@Column(name="ME_PARTICIPACION")
	private double participacion;
	
	@Column(name="ES_PROPIEDAD", length=1)
	private char estado;

	public Propiedad() {
		super();
	}

	public Propiedad(int idpd) {
		super();
		this.idpd = idpd;
	}

	public int getIdpd() {
		return idpd;
	}

	public void setIdpd(int idpd) {
		this.idpd = idpd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getParticipacion() {
		return participacion;
	}

	public void setParticipacion(double participacion) {
		this.participacion = participacion;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Propiedad [idpd=" + idpd + ", numero=" + numero + ", tipo=" + tipo + ", participacion=" + participacion
				+ ", estado=" + estado + "]";
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
