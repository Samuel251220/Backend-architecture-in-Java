package upeu.edu.pe.mauricio.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="THS_PERSONA")
public class Persona implements Serializable{


	@Id
	@Column(name="ID_PERSONA", length=50)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NO_PERSONA", length=100)
	private String nombre;
	
	@Column(name="AP_PATERNO", length=100)
	private String apPaterno;
	
	@Column(name="AP_MATERNO", length=100)
	private String apMaterno;
	
	@Column(name="NU_DNI", length=8)
	private int dni;
	
	@Column(name="CORREO", length=100)
	private String correo;
	
	@Column(name="NU_TELEFONO", length=7)
	private int telefono;
	
	@Column(name="DI_PERSONA", length=200)
	private String direccion;
	
	@Column(name="TI_GENERO", length=1)
	private char genero;
	
	@Column(name="FE_NACIMIENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date feNacimiento;
	
	@Column(name="NU_CELULAR", length=9)
	private int celular;
	
	
	
	public Persona() {
		
	}

	public Persona(int id) {
		super();
		this.id = id;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Date getFeNacimiento() {
		return feNacimiento;
	}

	public void setFeNacimiento(Date feNacimiento) {
		this.feNacimiento = feNacimiento;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno
				+ ", dni=" + dni + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", genero=" + genero + ", feNacimiento=" + feNacimiento + ", celular=" + celular + "]";
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
