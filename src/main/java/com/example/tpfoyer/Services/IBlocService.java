package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);

    List<Bloc> getAllBloc();

    Bloc getBlocById (Long idBloc );

    void deleteBloc(long idBloc);

    Bloc updateBloc(Bloc bloc);
    Bloc affecterChambreasBloc(List<Long> numChambre, long idBLoc);

}