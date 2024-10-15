package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Entities.Foyer;
import com.example.tpfoyer.Repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {
    FoyerRepository foyerRepository;
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }


    public List<Foyer> getAllFoyer() {
        return (List<Foyer>) foyerRepository.findAll();
    }


    public Foyer getFoyerById(Long IdFoyer) {
        return foyerRepository.findById(IdFoyer).get();
    }


    public void deleteFoyer(long IdFoyer) {
  foyerRepository.deleteById(IdFoyer);
    }


    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }



}
