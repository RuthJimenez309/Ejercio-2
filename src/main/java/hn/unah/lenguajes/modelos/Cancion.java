package hn.unah.lenguajes.modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "codigocancion")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cancion {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocancion")
    private Integer codigoCancion;

    @Column(name = "titulo")
    private String titulo;
			
	@Column(name = "album")
    private String album;

    @Column(name = "anyolanzamiento")
    private Integer anyoLanzamiento;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigoartista", referencedColumnName = "codigoartista")
    private Artista artista;


}
