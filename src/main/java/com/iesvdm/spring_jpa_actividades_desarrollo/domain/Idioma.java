package com.iesvdm.spring_jpa_actividades_desarrollo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String nombre;


    @OneToMany(mappedBy = "idioma", fetch = FetchType.EAGER)
    private Set<Pelicula> peliculas = new HashSet<>();

    @OneToMany(mappedBy = "idiomaOriginal")
    private Set<Pelicula> peliculaIdiomaOriginal = new HashSet<>();
}
