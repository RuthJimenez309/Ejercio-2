package hn.unah.lenguajes.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.modelos.Cancion;

public interface CancionRepository  extends CrudRepository<Cancion , String>  {
	
	

}
