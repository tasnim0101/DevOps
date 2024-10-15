package com.example.tpfoyer.Entities;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idUniversite;

    private String nomUniversite;

    private String adresse;
    @OneToOne
    private Foyer foyer;
}
