package com.iesvdm.spring_jpa_actividades_desarrollo.domain;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

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
    private long Numero;
    private Date Caducidad;

    @OneToOne(mappedBy = "tarjeta")
    private Socio socio;

}
