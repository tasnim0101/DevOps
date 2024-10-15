package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Repository.BlocRepository;
import com.example.tpfoyer.Repository.ChambreRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class BlocServiceImpl implements IBlocService {
 BlocRepository blocRepository;
 ChambreRepository chambreRepository;

 // override est utilise pour redefinir les methodes
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }


    public List<Bloc> getAllBloc() {
        return ( List<Bloc>) blocRepository.findAll();
    }


    public Bloc getBlocById(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }


    public void deleteBloc(long idBloc) {
  blocRepository.deleteById(idBloc);
    }


    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }


    public Bloc affecterChambreasBloc(List<Long> numChambre, long idBLoc) {
        return null;
    }
}
