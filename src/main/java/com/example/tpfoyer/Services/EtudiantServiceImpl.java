package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Etudiant;
import com.example.tpfoyer.Repository.EtudiantRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService {
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return  etudiantRepository.findAll()
                ;
    }

    @Override
    public Etudiant getEtudiantById(Long idEtudiant) {
        Optional<Etudiant> optionalEtudiant = etudiantRepository.findById(idEtudiant);

        if (optionalEtudiant.isEmpty()) {
            throw new EntityNotFoundException("Etudiant not found with id: " + idEtudiant);
        }

        return optionalEtudiant.get();
    }


    @Override
    public void deleteEtudiant(long idEtudiant) {
   etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
