package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUnivsersite(Universite universite);

    List<Universite> getAllUniversite();

    Universite getUniversiteById (Long idUniversite );

    void deleteUniversite(long idUniversite);

    Universite updateuniversite(Universite universite);

}
