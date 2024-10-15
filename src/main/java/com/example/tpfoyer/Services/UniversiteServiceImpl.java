package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Entities.Universite;
import com.example.tpfoyer.Repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUnivsersite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite getUniversiteById(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void deleteUniversite(long idUniversite) {
  universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite updateuniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}
