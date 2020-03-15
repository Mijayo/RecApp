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

}