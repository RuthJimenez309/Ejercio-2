package hn.unah.lenguajes.services;

import java.util.Optional;

import hn.unah.lenguajes.modelos.Cancion;

public interface CancionService {
	
	
	public Cancion crearCancion(Cancion cancion);
	Cancion eliminarCancion(String id);
	 public Optional<Cancion> buscarPorId(String id);
	 public Optional<Cancion> findById(String id);
	void deleteById(String id);
	public void guardar(Cancion cancion);
	 

}
