package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PROFESION database table.
 * 
 */
@Entity
@NamedQuery(name="Profesion.findAll", query="SELECT p FROM Profesion p")
public class Profesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PROFESION")
	private int idProfesion;

	public Profesion() {
	}

	public int getIdProfesion() {
		return this.idProfesion;
	}

	public void setIdProfesion(int idProfesion) {
		this.idProfesion = idProfesion;
	}

}