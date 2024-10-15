package com.example.tpfoyer.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    public   String sujet;

    @OneToOne(cascade = CascadeType.ALL)
    private ProjetDetail projetDetail;
    @ManyToOne(cascade = CascadeType.ALL)
    private Equipe equipe;

}
