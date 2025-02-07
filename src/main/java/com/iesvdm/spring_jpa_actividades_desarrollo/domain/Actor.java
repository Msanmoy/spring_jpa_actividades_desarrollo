package com.iesvdm.spring_jpa_actividades_desarrollo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String nombre;
    private String apellido;
    private LocalDateTime ultimaActualizacion;

    @ManyToMany
    private Set<Pelicula> peliculas;

}
