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

	@EmbeddedId
	private PreguntaPK id;

	@Column(name="ID_PREGUNTA")
	private int idPregunta;

	private String pregunta;

	@Column(name="TIPO_ENEAG")
	private String tipoEneag;

	public Pregunta() {
	}

	public PreguntaPK getId() {
		return this.id;
	}

	public void setId(PreguntaPK id) {
		this.id = id;
	}

	public int getIdPregunta() {
		return this.idPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
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