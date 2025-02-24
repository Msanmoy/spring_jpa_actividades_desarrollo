package com.iesvdm.spring_jpa_actividades_desarrollo.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String Numero;
    private LocalDate Caducidad;

    @OneToOne
    @JoinColumn(name = "socio_id", referencedColumnName = "id")
    private Socio socio;

}
