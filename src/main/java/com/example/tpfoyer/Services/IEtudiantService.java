package com.example.tpfoyer.Services;


import com.example.tpfoyer.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    Etudiant addEtudiant(Etudiant etudiant);

    List<Etudiant> getAllEtudiant();

    Etudiant getEtudiantById (Long idEtudiant );

    void deleteEtudiant(long idEtudiant);

    Etudiant updateEtudiant(Etudiant etudiant);

}
