package com.iesvdm.spring_jpa_actividades_desarrollo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(length = 25, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private Set<PeliculaCategoria> peliculasCategorias;
}
