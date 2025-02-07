package com.iesvdm.spring_jpa_actividades_desarrollo.domain;


import com.iesvdm.spring_jpa_actividades_desarrollo.enums.ClasificacionEnum;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = false)


@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String titulo;

    private Integer anyoLanzamiento;

    @ManyToOne
    @ToString.Exclude
    private Idioma idioma;

    @ManyToOne
    @ToString.Exclude
    private Idioma idiomaOriginal;

    private Integer decimalAlquiler;

    @Column(precision = 4, scale = 2)
    private BigDecimal rentalRate;

    private Short duracion;

    @Column(precision = 5, scale = 2)
    private BigDecimal replacementCost;

    private ClasificacionEnum clasificacion;

    @ManyToMany(mappedBy = "peliculas")
    private Set<CaracteristicaEspecial> caracteristicasEspeciales;

    private LocalDateTime ultimaActualizacion;

    @OneToMany(mappedBy = "pelicula")
    private Set<PeliculaCategoria> peliculaCategorias;

    @ManyToMany(mappedBy = "peliculas")
    private Set<Actor> actores;
}
