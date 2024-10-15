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
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idReservation;

    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiant;

}
