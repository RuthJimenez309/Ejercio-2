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
import hn.unah.lenguajes.modelos.Cancion;
import hn.unah.lenguajes.services.impl.CancionServiceImpl;

@RestController
@RequestMapping("/api/cancion")
public class CancionController {
	
	@Autowired
    public CancionServiceImpl cancionservice;

	 @PostMapping("/guardar")
	    public Cancion crearCancion(@RequestBody Cancion cancion) {
	        cancionservice.crearCancion(cancion);
	        return cancion;
	    }
	 
	 @GetMapping("/delete/{id}")
	    public ResponseEntity<String> cancionEliminar(@PathVariable(name = "id") String id){
	      Cancion cancion =  cancionservice.eliminarCancion(id);
		return null;

	        
	        }

}
