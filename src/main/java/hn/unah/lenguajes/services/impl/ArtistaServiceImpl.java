package hn.unah.lenguajes.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hn.unah.lenguajes.modelos.Artista;
import hn.unah.lenguajes.modelos.InformacionContacto;
import hn.unah.lenguajes.repositories.InformacionContactoRepository;
import hn.unah.lenguajes.services.ArtistaService;

@Service
public class ArtistaServiceImpl  implements ArtistaService { 

	
	

	@Override
	public Optional<Artista> buscarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Autowired
    public ArtistaService artistaimpl;

    @Autowired
    public InformacionContactoRepository infocontactoimpl;

    @Override
    public Artista crearArtistas(Artista artista) {
        artistaimpl.guardar(artista);
        return artista;
    }
    @Override
    public Artista eliminarArtistas(String id) {
        Optional<Artista> eliminarArtista = artistaimpl.findById(id);
        if(eliminarArtista.isPresent()) {
            artistaimpl.deleteById(id);
            return eliminarArtista.get();
        }else {
        return null;}
    }
    public Artista actualizarDireccionArtistas(Integer codigoArtista, InformacionContacto informacionContacto) {
        String codigoArtistaStr = codigoArtista.toString();
         Artista artista = artistaimpl.findById(codigoArtistaStr).orElse(null);
        if (artista != null) {
            artista.setInformacioncontacto(informacionContacto);
            return artistaimpl.guardar(artista);
        }
        return null;
    }


    
	
	
}
