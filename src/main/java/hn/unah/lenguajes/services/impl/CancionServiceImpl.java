package hn.unah.lenguajes.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.modelos.Artista;
import hn.unah.lenguajes.modelos.Cancion;
import hn.unah.lenguajes.services.ArtistaService;
import hn.unah.lenguajes.services.CancionService;
@Service
public class CancionServiceImpl implements CancionService{
	
	@Autowired
    public CancionService cancionimpl;

	
	@Override
	public Optional<Cancion> buscarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
    public Cancion crearCancion(Cancion cancion) {
        cancionimpl.guardar(cancion);
        return cancion;
    }

	
	 @Override
	    public Cancion eliminarCancion(String id) {
	        Optional<Cancion> eliminarCancion = cancionimpl.findById(id);
	        if(eliminarCancion.isPresent()) {
	        	cancionimpl.deleteById(id);
	            return eliminarCancion.get();
	        }else {
	        return null;}
	    }

}
