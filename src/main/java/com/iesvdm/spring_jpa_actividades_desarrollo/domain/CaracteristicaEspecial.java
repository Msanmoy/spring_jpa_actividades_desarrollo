package com.iesvdm.spring_jpa_actividades_desarrollo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = false)


@Entity
public class CaracteristicaEspecial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String caracteristica;

    @ManyToMany
    private Set<Pelicula> peliculas;

}
