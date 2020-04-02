package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the anuncio database table.
 * 
 */
@Entity
@NamedQuery(name="Anuncio.findAll", query="SELECT a FROM Anuncio a")
public class Anuncio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ANUN_AUX")
	private int idAnunAux;

	private String cargo;

	private String detalle;

	private int eneagrama;

	private String keyword;

	private String requerimientos;

	private String salario;

	@Column(name="TIPO_JORNADA")
	private String tipoJornada;

	private String ubicacion;

	public Anuncio() {
	}

	public int getIdAnunAux() {
		return this.idAnunAux;
	}

	public void setIdAnunAux(int idAnunAux) {
		this.idAnunAux = idAnunAux;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getEneagrama() {
		return this.eneagrama;
	}

	public void setEneagrama(int eneagrama) {
		this.eneagrama = eneagrama;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getRequerimientos() {
		return this.requerimientos;
	}

	public void setRequerimientos(String requerimientos) {
		this.requerimientos = requerimientos;
	}

	public String getSalario() {
		return this.salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getTipoJornada() {
		return this.tipoJornada;
	}

	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}