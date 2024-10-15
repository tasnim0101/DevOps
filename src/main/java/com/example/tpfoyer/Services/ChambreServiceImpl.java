package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Entities.Chambre;
import com.example.tpfoyer.Repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre getChambreById(Long idChambre) {
       return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void deleteChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);

    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}
