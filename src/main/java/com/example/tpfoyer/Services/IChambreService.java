package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Entities.Chambre;

import java.util.List;

public interface IChambreService {


    Chambre addChambre(Chambre chambre);

    List<Chambre> getAllChambre();

    Chambre getChambreById (Long idChambre );

    void deleteChambre(long idChambre);

    Chambre updateChambre(Chambre chambre);


}
