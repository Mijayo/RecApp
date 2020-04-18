package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PREGUNTA database table.
 * 
 */
@Entity
@NamedQuery(name="Pregunta.findAll", query="SELECT p FROM Pregunta p")
public class Pregunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_AUX")
	private int idAux;

	@Column(name="ID_PREGUNTA")
	private int idPregunta;

	@Column(name="NUM_PREGUNTA")
	private int numPregunta;

	private String pregunta;

	@Column(name="TIPO_ENEAG")
	private String tipoEneag;

	public Pregunta() {
	}
	
	

	public Pregunta(int idAux, int idPregunta, int numPregunta, String pregunta, String tipoEneag) {
		super();
		this.idAux = idAux;
		this.idPregunta = idPregunta;
		this.numPregunta = numPregunta;
		this.pregunta = pregunta;
		this.tipoEneag = tipoEneag;
	}



	public int getIdAux() {
		return this.idAux;
	}

	public void setIdAux(int idAux) {
		this.idAux = idAux;
	}

	public int getIdPregunta() {
		return this.idPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}

	public int getNumPregunta() {
		return this.numPregunta;
	}

	public void setNumPregunta(int numPregunta) {
		this.numPregunta = numPregunta;
	}

	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getTipoEneag() {
		return this.tipoEneag;
	}

	public void setTipoEneag(String tipoEneag) {
		this.tipoEneag = tipoEneag;
	}
  
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAux;
		result = prime * result + idPregunta;
		result = prime * result + numPregunta;
		result = prime * result + ((pregunta == null) ? 0 : pregunta.hashCode());
		result = prime * result + ((tipoEneag == null) ? 0 : tipoEneag.hashCode());
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
		Pregunta other = (Pregunta) obj;
		if (idAux != other.idAux)
			return false;
		if (idPregunta != other.idPregunta)
			return false;
		if (numPregunta != other.numPregunta)
			return false;
		if (pregunta == null) {
			if (other.pregunta != null)
				return false;
		} else if (!pregunta.equals(other.pregunta))
			return false;
		if (tipoEneag == null) {
			if (other.tipoEneag != null)
				return false;
		} else if (!tipoEneag.equals(other.tipoEneag))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Pregunta [idAux=" + idAux + ", idPregunta=" + idPregunta + ", numPregunta=" + numPregunta
				+ ", pregunta=" + pregunta + ", tipoEneag=" + tipoEneag + "]";
	}

	
	
	
	
	
}