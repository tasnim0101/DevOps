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
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetail;
    public  String description;
    public String technologie;
    public long cout;
    public  Date dateDebut;
    @OneToOne(mappedBy = "projetDetail",cascade = CascadeType.ALL)
    private Projet projet;

}
