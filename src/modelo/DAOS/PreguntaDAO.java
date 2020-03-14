package modelo.DAOS;

import java.util.List;

import modelo.beans.Pregunta;

public interface PreguntaDAO {
	
	public List<Pregunta> findAll();
	
	public List<Pregunta> findByTipoEneg(int tipoEneg);

	public int findByID(int tipoID);

}
