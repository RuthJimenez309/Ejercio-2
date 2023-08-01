package hn.unah.lenguajes.modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "codigocontacto")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class InformacionContacto {
	
	
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocontacto")
    private Integer codigoContacto;
	private String pais;
	private String cuidad;
	private String telefono;
	private String correo;
	

	
	@JsonIgnore
    @OneToOne(mappedBy = "informacioncontacto")
    private Artista artista;
}
