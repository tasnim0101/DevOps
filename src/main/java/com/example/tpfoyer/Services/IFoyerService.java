package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Entities.Foyer;

import java.util.List;

public interface IFoyerService {

    Foyer addFoyer(Foyer foyer);

    List<Foyer> getAllFoyer();

    Foyer getFoyerById (Long IdFoyer);

    void deleteFoyer(long IdFoyer);

    Foyer updateFoyer(Foyer foyer);

}
