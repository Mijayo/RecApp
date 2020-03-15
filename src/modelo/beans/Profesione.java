package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PROFESIONES database table.
 * 
 */
@Entity
@Table(name="PROFESIONES")
@NamedQuery(name="Profesione.findAll", query="SELECT p FROM Profesione p")
public class Profesione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PROFESION")
	private int idProfesion;

	public Profesione() {
	}
	
	

	public Profesione(int idProfesion) {
		super();
		this.idProfesion = idProfesion;
	}



	public int getIdProfesion() {
		return this.idProfesion;
	}

	public void setIdProfesion(int idProfesion) {
		this.idProfesion = idProfesion;
	}



	@Override
	public String toString() {
		return "Profesione [idProfesion=" + idProfesion + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProfesion;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesione other = (Profesione) obj;
		if (idProfesion != other.idProfesion)
			return false;
		return true;
	}

	
	
}