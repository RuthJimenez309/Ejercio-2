package hn.unah.lenguajes.modelos;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "codigoartista")
@Getter
@Setter
@AllArgsConstructor

public class Artista {
	
	

	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoartista")
    private Integer codigoArtista;
	private String nombreArtiticco;
	private String nombre;
	private String apellido;
	
	@Column(name = "fechanacimiento")
    private Date fechaNacimiento;



    @OneToOne
    @JoinColumn(name = "codigocontacto", referencedColumnName = "codigocontacto")
    private InformacionContacto informacioncontacto;

    @OneToMany(mappedBy = "artista")
    private List<Cancion> canciones;

}
