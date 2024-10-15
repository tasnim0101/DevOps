package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Entities.Projet;
import com.example.tpfoyer.Repository.ProjetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class ProjetServiceImpl implements IProjetService{
    ProjetRepository projetRepository;
    public Projet addProjetAndProjetDeatil(Projet projet) {
        return projetRepository.save(projet);
    }
}
