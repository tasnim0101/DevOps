package com.example.tpfoyer.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdFoyer;
    public String nomFoyer;
    public long capacite;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foyer")
    private Set<Bloc> Bloc;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;

}
