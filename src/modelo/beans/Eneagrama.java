package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ENEAGRAMA database table.
 * 
 */
@Entity
@NamedQuery(name = "Eneagrama.findAll", query = "SELECT e FROM Eneagrama e")
public class Eneagrama implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_ENEAGRAMA")
	private int idEneagrama;

	private String descripcion;

	private int sum;

	private String tipo;

	public Eneagrama() {
	}

	public Eneagrama(int idEneagrama, String descripcion, int sum, String tipo) {
		super();
		this.idEneagrama = idEneagrama;
		this.descripcion = descripcion;
		this.sum = sum;
		this.tipo = tipo;
	}

	public int getIdEneagrama() {
		return this.idEneagrama;
	}

	public void setIdEneagrama(int idEneagrama) {
		this.idEneagrama = idEneagrama;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getSum() {
		return this.sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}