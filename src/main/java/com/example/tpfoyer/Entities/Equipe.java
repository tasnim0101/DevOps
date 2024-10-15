package com.example.tpfoyer.Entities;
import jakarta.persistence.*;
import lombok.*;


import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long equipe_id;
    public String nom;
    public  Domaine domaine;
    @OneToMany(mappedBy = "equipe",cascade = CascadeType.ALL)
    private Set<Projet> projets ;
}
