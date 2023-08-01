package hn.unah.lenguajes.services;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.modelos.InformacionContacto;

public interface InformacionContactoService  extends CrudRepository<InformacionContacto , String> {

}
