package modelo.DAOS;

import java.util.List;

import modelo.beans.Anuncio;


public interface AnuncioDAO {
	
	public Anuncio findBy(int id);
	
	public List<Anuncio> findByID(int tipoID);

}

