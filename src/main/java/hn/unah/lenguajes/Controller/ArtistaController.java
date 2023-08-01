package hn.unah.lenguajes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.modelos.Artista;
import hn.unah.lenguajes.modelos.InformacionContacto;
import hn.unah.lenguajes.services.impl.ArtistaServiceImpl;

@RestController
@RequestMapping("/api/artista")
public class ArtistaController {
	
	@Autowired
    public ArtistaServiceImpl artistaservice;

    @PostMapping("/guardar")
    public Artista crearArtista(@RequestBody Artista artista) {
        artistaservice.crearArtistas(artista);
        return artista;
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> artistaEliminar(@PathVariable(name = "id") String id){
        Artista artistaEliminar =  artistaservice.eliminarArtistas(id);

        if(artistaEliminar != null) {
            return ResponseEntity.ok("Artista "+ artistaEliminar.getNombre() + "eliminado");
        }else {
        return null;
        }

    }

    

}
