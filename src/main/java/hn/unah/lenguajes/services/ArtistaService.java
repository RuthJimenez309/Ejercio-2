package hn.unah.lenguajes.services;

import java.util.Optional;

import hn.unah.lenguajes.modelos.Artista;
import hn.unah.lenguajes.modelos.InformacionContacto;

public interface ArtistaService {
	
		public Artista crearArtistas(Artista artista);
	     Artista eliminarArtistas(String id);
	
	     public Artista actualizarDireccionArtistas(Integer codigoArtista, InformacionContacto informacionContacto); 
	     public Optional<Artista> buscarPorId(String id);
		 public Optional<Artista> findById(String id);
		 Optional<Artista> buscarPorIdiOptional(String id);
		 public Artista guardar(Artista artista);
		 public void deleteById(String id);
		     
	     

}
